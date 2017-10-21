package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import com.rongzi.ms.helpers.Env;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
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
public abstract class WebDriverBuilder extends RemoteDriverBuilder {


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
    public WebDriver getWebDriver() {
        init();
        return null;
    }

    public abstract static class WebDriverMeta extends DriverMeta {

    }
}
