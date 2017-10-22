package com.rongzi.ms.helpers.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class RemoteDriverBuilder implements DriverBuilder {

    private DesiredCapabilities capabilities;

    public RemoteDriverBuilder(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }

    protected abstract void init();

    public abstract WebDriver getWebDriver();

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

}
