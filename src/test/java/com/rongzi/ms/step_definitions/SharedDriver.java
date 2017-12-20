package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Env;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by lining on 2017/7/2.
 */
public class SharedDriver extends EventFiringWebDriver {

    private static final WebDriver REAL_DRIVER = WebDriverFactory.create();

    private static final Thread CLOSE_THREAD = new Thread(REAL_DRIVER::quit);

    static {
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }

    public SharedDriver() {
        super(REAL_DRIVER);
    }


    @Override
    public void quit() {
        if (Thread.currentThread() != CLOSE_THREAD) {
            throw new UnsupportedOperationException("You shouldn't quit this WebDriver. It's shared and will quit when the JVM exits.");
        }
        super.quit();
    }

    @Before
    public void deleteAllCookies() {
        manage().deleteAllCookies();
        String height = Env.getProperty("window.height");
        String width = Env.getProperty("window.width");

        if (!StringUtils.isEmpty(height) && !StringUtils.isEmpty(width)) {
            manage().window().setSize(new Dimension(Integer.valueOf(height), Integer.valueOf(width)));


        } else {
            if (!(REAL_DRIVER instanceof AppiumDriver)) {
                manage().window().maximize();
            }
        }


    }

    @After
    public void embedScreenshot(Scenario scenario) {
        try {
            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
    }
}
