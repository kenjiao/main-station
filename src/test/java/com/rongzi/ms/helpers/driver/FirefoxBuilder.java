package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lining on 2017/9/8.
 */
public class FirefoxBuilder extends WebDriverBuilder {


    public FirefoxBuilder() {
        super(DesiredCapabilities.firefox());
    }


    @Override
    public WebDriver getWebDriver() {
        return new FirefoxDriver(getCapabilities());
    }

    public static class FirefoxMeta extends WebDriverMeta {

        @Override
        public String getType() {
            return BinaryType.FIREFOX.name();
        }

        @Override
        public DriverBuilder getBuilder() {
            return new FirefoxBuilder();
        }
    }
}
