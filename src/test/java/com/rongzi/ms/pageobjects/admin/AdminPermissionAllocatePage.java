package com.rongzi.ms.pageobjects.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

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

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-data\"]/table/tbody")
    public static List<WebElement> data_recordid;

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-data\"]/table/tbody/tr/td[5]/a[1]")
    public static WebElement edit_btn;

    @FindBy(how=How.XPATH, using="//*[@type=\"page\"]")
    public static WebElement dialog_box;

    @FindBy(how=How.XPATH, using="//*[@id=\"nickName\"]")
    public static WebElement nick_name;

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSubmit\"]")
    public static WebElement submit_btn;
}
