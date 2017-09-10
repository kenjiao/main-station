package com.rongzi.ms.pageobjects.mobile;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by lining on 2017/9/10.
 */
public class MCityPage extends BaseClass {

    public MCityPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//header/div")
    public static WebElement header;

    @FindBy(how = How.XPATH, using = "//*[@class=\"hot-city-section\"]/div/div/a")
    public static List<WebElement> cities;
}
