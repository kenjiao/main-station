package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lining on 2017/9/8.
 */
public class InternetExplorerBuilder extends WebDriverBuilder {


    public InternetExplorerBuilder() {
        super(DesiredCapabilities.internetExplorer());
    }

    @Override
    public WebDriver getWebDriver() {
        return new InternetExplorerDriver(getCapabilities());
    }

    public static class InternetExplorereMeta extends WebDriverMeta {

        @Override
        public String getType() {
            return BinaryType.IE.name();
        }

        @Override
        public DriverBuilder getBuilder() {
            return new InternetExplorerBuilder();
        }
    }
}
