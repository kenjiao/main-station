package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.Env;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static org.openqa.selenium.Proxy.ProxyType.MANUAL;
import static org.openqa.selenium.remote.CapabilityType.HAS_NATIVE_EVENTS;
import static org.openqa.selenium.remote.CapabilityType.PROXY;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class MobileDriverBuilder extends RemoteDriverBuilder {


    private AppiumServiceBuilder builder;

    public MobileDriverBuilder(DesiredCapabilities capabilities) {
        super(capabilities);
    }

    @Override
    protected void init() {
        builder = new AppiumServiceBuilder().
                withArgument(GeneralServerFlag.LOG_LEVEL, Env.getProperty("appium.log.level", "info")).
                usingAnyFreePort() /*and so on*/;
    }

    @Override
    public WebDriver build() {
        String hub = Env.getProperty("remote.hub");

        if (!StringUtils.isEmpty(hub)) {

            try {
                return getWebDriver(new URL(hub));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else {
            init();
            return getWebDriver();
        }
    }

    public abstract WebDriver getWebDriver();

    public abstract WebDriver getWebDriver(URL url);

    public AppiumServiceBuilder getBuilder() {
        return builder;
    }

    public abstract static class MobileDriverMeta extends DriverMeta {

    }
}
