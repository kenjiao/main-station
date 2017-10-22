package com.rongzi.ms.helpers.driver;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

/**
 * Created by lining on 2017/9/8.
 */
public class IOSBuilder extends MobileDriverBuilder {


    public IOSBuilder() {
        super(DesiredCapabilities.iphone());
    }

    @Override
    public WebDriver getWebDriver() {
        return new IOSDriver<>(getBuilder(), getCapabilities());
    }

    @Override
    public WebDriver getWebDriver(URL url) {
        return new IOSDriver<>(url, getCapabilities());
    }

    @Override
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = super.getCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//        capabilities.setCapability(MobileCapabilityType.UDID, "auto");
        return capabilities;
    }

    public static class IOSMeta extends MobileDriverMeta {

        @Override
        public String getType() {
            return "IOS";
        }

        @Override
        public DriverBuilder getBuilder() {
            return new IOSBuilder();
        }
    }
}
