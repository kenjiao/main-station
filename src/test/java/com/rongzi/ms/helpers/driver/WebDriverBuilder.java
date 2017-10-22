package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import com.rongzi.ms.helpers.Env;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.net.MalformedURLException;
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
public abstract class WebDriverBuilder extends RemoteDriverBuilder implements Proxy {


    public WebDriverBuilder(DesiredCapabilities capabilities) {
        super(capabilities);
    }

    @Override
    protected void init() {


        String directory = Env.getProperty("binary.root.directory", "selenium_standalone");

        BinaryType binaryType = BinaryType.valueOf(Env.getWebDriver().toUpperCase());

        String property = binaryType.getDriverSystemProperty();

        ArrayList<String> binaries = binaryType.getBinaryFilenames();

        Path dir = Paths.get(directory);

        try {
            Files.walk(dir)
                    .filter(path -> Files.isRegularFile(path))
                    .forEach(path -> {
                        String filename = path.getFileName().toString();
                        if (binaries.contains(filename)) {
                            String binaryPath = path.toAbsolutePath().toString();
                            System.setProperty(property, binaryPath);
                        }

                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public WebDriver build() {
        if (Boolean.valueOf(Env.getProperty("proxy.enable", "false"))) {
            proxy();
        }
        String hub = Env.getProperty("remote.hub");

        if (!StringUtils.isEmpty(hub)) {

            try {
                return new RemoteWebDriver(new URL(hub), getCapabilities());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else {
            init();
            return getWebDriver();
        }

    }

    public void proxy() {

        String proxyDetails = getProxyDetails();
        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setProxyType(MANUAL);
        proxy.setHttpProxy(proxyDetails);
        proxy.setSslProxy(proxyDetails);
        getCapabilities().setCapability(PROXY, proxy);

    }

    protected String getProxyDetails() {
        return String.format("%s:%d", Env.getProperty("proxy.host"), Integer.valueOf(Env.getProperty("proxy.port")));
    }

    public abstract WebDriver getWebDriver();



    public abstract static class WebDriverMeta extends DriverMeta {

    }
}
