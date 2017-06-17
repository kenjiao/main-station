package com.rongzi.ms.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import static org.testng.AssertJUnit.assertEquals;

public class HappinessFrogAddressProceed {

    public static void Execute(WebDriver driver, String title) {

        new WebDriverWait(driver, 10).until((ExpectedCondition<Boolean>) webDriver -> webDriver.getTitle().startsWith("Frog"));
        assertEquals(driver.getTitle(), title);
        Reporter.log("Happiness Frog page verify successful");
    }
}
