package com.rongzi.ms.pageobjects.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminPage extends BaseClass {

    public AdminPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//a[@href=\"/User/LogOut\"]")
    public static WebElement logOut;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[1]/a/i[2]")
    public static WebElement usermanager;

    @FindBy(how=How.XPATH, using="//*[@href=\"/usermanage/index\"]")
    public static WebElement userinfo;

    @FindBy(how=How.XPATH, using="//*[@href=\"/statistic/registersource\"]")
    public static WebElement registersource;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-selection__arrow\"]")
    public static WebElement registerplotbtn;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-results__options\"]/li")
    public static List<WebElement> registerplot;

    @FindBy(how=How.XPATH, using="//*[@id=\"form_search_condition\"]/ul/li[4]/button")
    public static WebElement search;



}
