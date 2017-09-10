package com.rongzi.ms.pageobjects.mobile;

import com.rongzi.ms.pageobjects.BaseClass;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

/**
 * Created by lining on 2017/9/10.
 */
public class CurrentPage extends BaseClass {
    public CurrentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"currentCity\"]")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    public static WebElement currentCity;

}
