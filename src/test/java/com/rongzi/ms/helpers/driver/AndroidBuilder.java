package com.rongzi.ms.helpers.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
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

    @Override
    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = super.getCapabilities();
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false); //不初始化浏览器
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");  //设备名称
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
        capabilities.setCapability("appPackage", "com.android.browser");
        capabilities.setCapability("appActivity", ".BrowserActivity");
        return capabilities;
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
