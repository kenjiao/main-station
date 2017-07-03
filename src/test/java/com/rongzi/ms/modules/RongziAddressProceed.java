package com.rongzi.ms.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import static org.testng.AssertJUnit.assertEquals;

public class RongziAddressProceed {

    public static void execute(WebDriver driver, String title) {

        assertEquals(driver.getTitle(), title);
        Reporter.log("Rongzi page verify successful");
    }

}
