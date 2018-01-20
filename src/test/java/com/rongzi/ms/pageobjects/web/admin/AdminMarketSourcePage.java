package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminMarketSourcePage extends BaseClass {

    public AdminMarketSourcePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@class=\"ul-searchItems\"]/li[5]")
    public static WebElement clear_btn;

    @FindBy(how=How.XPATH, using="//*[@id=\"SourceName\"]")
    public static WebElement source_name;

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;


}
