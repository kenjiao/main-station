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
    public static WebElement log_out;

    @FindBy(how=How.XPATH, using="//*[@class=\"header\"]/div/span")
    public static WebElement login_user_name;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[1]/a/i[2]")
    public static WebElement user_manager;

    @FindBy(how=How.XPATH, using="//*[@href=\"/usermanage/index\"]")
    public static WebElement user_info;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[2]/a/i[2]")
    public static WebElement data_statistic;

    @FindBy(how=How.XPATH, using="//*[@href=\"/statistic/registersource\"]")
    public static WebElement register_source_statistic;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[3]/a/i[2]")
    public static WebElement market_config;

    @FindBy(how=How.XPATH, using="//*[@href=\"/utmsource/source\"]")
    public static WebElement source_info;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[4]/a/i[2]")
    public static WebElement permission_manage;

    @FindBy(how=How.XPATH, using="//*[@href=\"/user/add\"]")
    public static WebElement add_permission_user;

    @FindBy(how=How.XPATH, using="//*[@href=\"/Admin/PermissionManage\"]")
    public static WebElement permission_allocat;

    @FindBy(how=How.XPATH, using="//ul[@class=\"ul-menu\"]/li[7]/a/i[2]")
    public static WebElement operation_manager;

    @FindBy(how=How.XPATH, using="//*[@href=\"/BusinessInMotion/CustomServiceRequirement\"]")
    public static WebElement custom_requirement;

}
