package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.Env;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class MobileDriverBuilder implements DriverBuilder, Proxy {

    private DesiredCapabilities capabilities;

    private AppiumServiceBuilder builder;


    public MobileDriverBuilder(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    private void init() {
        builder = new AppiumServiceBuilder().
                withArgument(GeneralServerFlag.LOG_LEVEL, Env.getProperty("appium.log.level", "info")).
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
