package com.rongzi.ms.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import static org.testng.AssertJUnit.assertEquals;

public class RongziAddressProceed {

    public static void Execute(WebDriver driver, String title) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until((ExpectedCondition<Boolean>) webDriver -> webDriver.getTitle().startsWith("东方融资网"));
        assertEquals(driver.getTitle(), title);
        Reporter.log("Rongzi page verify successful");
    }

}
