package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.Env;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class MobileDriverBuilder implements DriverBuilder, Proxy {

    private DesiredCapabilities capabilities;

    public MobileDriverBuilder(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    public void init() {

        // TODO: 2017/9/8 init appium service
    }

    @Override
    public WebDriver build() {
        init();
        String hub = Env.getProperty("remote.hub", "http://localhost:4444/wd/hub");
        try {
            return getWebDriver(new URL(hub));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    public void proxy() {

        // TODO: 2017/9/8  proxy

    }

    public abstract WebDriver getWebDriver(URL remote);

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

    public abstract static class MobileDriverMeta extends DriverMeta {

    }
}
