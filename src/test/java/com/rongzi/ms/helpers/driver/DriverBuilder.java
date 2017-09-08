package com.rongzi.ms.helpers.driver;

import org.openqa.selenium.WebDriver;

/**
 * Created by lining on 2017/9/8.
 */
public interface DriverBuilder {

    WebDriver build();

    public abstract static class DriverMeta {

        public abstract String getType();

        public abstract DriverBuilder getBuilder();

    }
}
