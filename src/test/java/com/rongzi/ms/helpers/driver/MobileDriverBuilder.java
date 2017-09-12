package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.Env;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class MobileDriverBuilder implements DriverBuilder, Proxy {

    private DesiredCapabilities capabilities;

    private AppiumServiceBuilder builder;

    private static Map<String, String> appiumMapping = new HashMap<>();

    static {

        appiumMapping.put(Platform.MAC.name(), "/usr/local/lib/node_modules/appium/build/lib/main.js");
        appiumMapping.put(Platform.LINUX.name(), "/usr/local/lib/node_modules/appium/build/lib/main.js");
        appiumMapping.put(Platform.WINDOWS.name(), "C:/Program Files (x86)/Appium/node_modules/appium/bin/appium.js");

    }


    public MobileDriverBuilder(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    private void init() {

        builder = new AppiumServiceBuilder().
                withAppiumJS(new File(appiumMapping.get(Platform.getCurrent().name()))).
                withArgument(GeneralServerFlag.LOG_LEVEL, "info").
                usingAnyFreePort() /*and so on*/;
    }

    @Override
    public WebDriver build() {
        init();
        return getWebDriver();
    }

    public void proxy() {

        // TODO: 2017/9/8  proxy

    }

    public abstract WebDriver getWebDriver();

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

    public AppiumServiceBuilder getBuilder() {
        return builder;
    }

    public abstract static class MobileDriverMeta extends DriverMeta {

    }
}
