package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lining on 2017/9/8.
 */
public class ChromeBuilder extends WebDriverBuilder {


    public ChromeBuilder() {
        super(DesiredCapabilities.chrome());
    }


    @Override
    public WebDriver getWebDriver() {
        return new ChromeDriver(getCapabilities());
    }

    public static class ChromeMeta extends WebDriverMeta {

        @Override
        public String getType() {
            return BinaryType.CHROME.name();
        }

        @Override
        public DriverBuilder getBuilder() {
            return new ChromeBuilder();
        }
    }
}
