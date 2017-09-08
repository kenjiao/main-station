package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import com.rongzi.ms.helpers.Env;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static org.openqa.selenium.Proxy.ProxyType.MANUAL;
import static org.openqa.selenium.remote.CapabilityType.PROXY;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class WebDriverBuilder implements DriverBuilder, Proxy {

    private DesiredCapabilities capabilities;

    public WebDriverBuilder(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public void init() throws IOException {


        String directory = Env.getProperty("binary.root.directory", "selenium_standalone");

        BinaryType binaryType = BinaryType.valueOf(Env.getWebDriver());

        String property = binaryType.getDriverSystemProperty();

        ArrayList<String> binaries = binaryType.getBinaryFilenames();

        Path dir = Paths.get(directory);

        Files.walk(dir)
                .filter(path -> Files.isRegularFile(path))
                .forEach(path -> {
                    String filename = path.getFileName().toString();
                    if (binaries.contains(filename)) {
                        String binaryPath = path.toAbsolutePath().toString();
                        System.setProperty(property, binaryPath);
                    }

                });


    }

    @Override
    public WebDriver build() throws IOException {
        String hub = Env.getProperty("remote.hub");
        proxy();
        if (StringUtils.isEmpty(hub)) {
            init();
            return getWebDriver();
        } else {
            return new RemoteWebDriver(new URL(hub), capabilities);
        }

    }

    public void proxy() {

        if (Boolean.valueOf(Env.getProperty("proxy.enable", "false"))) {
            String proxyDetails = String.format("%s:%d", Env.getProperty("proxy.host"), Integer.valueOf(Env.getProperty("proxy.port")));
            org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
            proxy.setProxyType(MANUAL);
            proxy.setHttpProxy(proxyDetails);
            proxy.setSslProxy(proxyDetails);
            capabilities.setCapability(PROXY, proxy);
        }

    }

    public abstract WebDriver getWebDriver();

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

    public abstract static class WebDriverMeta extends DriverMeta {
        @Override
        public String getType() {
            return "WEB";
        }
    }
}
