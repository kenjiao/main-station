package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.BinaryType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void proxy() {
        List<String> cliArguments = new ArrayList<>();
        cliArguments.add("--proxy-type=http");
        cliArguments.add("--proxy=" + getProxyDetails());
        getCapabilities().setCapability("phantomjs.cli.args", cliArguments);
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
