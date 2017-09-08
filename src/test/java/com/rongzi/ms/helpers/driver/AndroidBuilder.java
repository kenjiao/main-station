package com.rongzi.ms.helpers.driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

/**
 * Created by lining on 2017/9/8.
 */
public class AndroidBuilder extends MobileDriverBuilder {


    public AndroidBuilder() {
        super(DesiredCapabilities.android());
    }

    @Override
    public WebDriver getWebDriver(URL remote) {
        return new AndroidDriver<>(remote, getCapabilities());
    }

    public static class AndroidMeta extends MobileDriverMeta {

        @Override
        public String getType() {
            return "ANDROID";
        }

        @Override
        public DriverBuilder getBuilder() {
            return new AndroidBuilder();
        }
    }
}
