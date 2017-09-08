package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.helpers.driver.DriverBuilder;
import com.rongzi.ms.helpers.driver.DriverRegistry;
import org.openqa.selenium.WebDriver;

/**
 * Created by lining on 2017/7/2.
 */
final class WebDriverFactory {


    private WebDriverFactory() {

    }


    static WebDriver create() {


        String webDriverProperty = Env.getWebDriver();

        if (webDriverProperty == null || webDriverProperty.isEmpty()) {
            throw new IllegalStateException("The webdriver system property must be set");
        }

        DriverBuilder.DriverMeta meta = DriverRegistry.getMeta(webDriverProperty);
        return meta.getBuilder().build();
    }

}
