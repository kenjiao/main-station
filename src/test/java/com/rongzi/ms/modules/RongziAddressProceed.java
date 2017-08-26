package com.rongzi.ms.modules;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.pageobjects.CityPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import static org.testng.AssertJUnit.assertTrue;

public class RongziAddressProceed {


    public static void open(WebDriver driver, String city) {
        driver.get(Env.getProperty("rongzi.index") + "/CityList");

        PageFactory.initElements(driver, CityPage.class);

        for (WebElement element : CityPage.cities) {

            if (element.getText().equals(city)) {
                element.click();
                return;
            }

        }


    }

    public static void execute(WebDriver driver, String title) {

        assertTrue(driver.getTitle().contains(title));
        Reporter.log("Rongzi page verify successful");
    }

}
