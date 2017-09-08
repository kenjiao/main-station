package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lining on 2017/9/8.
 */
public class PhantomjsBuilder extends WebDriverBuilder {

    public PhantomjsBuilder() {
        super(DesiredCapabilities.phantomjs());
    }

    @Override
    public WebDriver getWebDriver() {
        return new PhantomJSDriver(getCapabilities());
    }

    public static class PhantomjsMeta extends WebDriverMeta {

        @Override
        public String getType() {
            return BinaryType.PHANTOMJS.name();
        }

        @Override
        public DriverBuilder getBuilder() {
            return new PhantomjsBuilder();
        }
    }
}
