package com.rongzi.ms.pageobjects.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPermissionAllocatePage extends BaseClass {

    public AdminPermissionAllocatePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@class=\"ul-searchItems\"]/li[5]")
    public static WebElement clear_btn;

    @FindBy(how=How.XPATH, using="//*[@class=\"ul-searchItems\"]/li[1]/input")
    public static WebElement user_name;

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;


}
