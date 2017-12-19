package com.rongzi.ms.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
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
        if (!(REAL_DRIVER instanceof AppiumDriver)){
            manage().window().maximize();
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
