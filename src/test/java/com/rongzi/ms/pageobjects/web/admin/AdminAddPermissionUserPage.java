package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminAddPermissionUserPage extends BaseClass {

    public AdminAddPermissionUserPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"userNameInput\"]")
    public static WebElement user_name;

    @FindBy(how=How.XPATH, using="//*[@id=\"nickNameInput\"]")
    public static WebElement nick_name;

    @FindBy(how=How.XPATH, using="//*[@id=\"newPswInput\"]")
    public static WebElement new_password;

    @FindBy(how=How.XPATH, using="//*[@id=\"reNewPswInput\"]")
    public static WebElement renew_password;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-selection__arrow\"]")
    public static WebElement role_btn;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-results\"]/ul/li")
    public static List<WebElement> role;

    @FindBy(how=How.XPATH, using="//*[@type=\"submit\"]")
    public static WebElement submit_btn;

}
