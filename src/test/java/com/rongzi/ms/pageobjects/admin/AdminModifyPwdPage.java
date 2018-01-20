package com.rongzi.ms.pageobjects.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminModifyPwdPage extends BaseClass {

    public AdminModifyPwdPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"oldPswInput\"]")
    public static WebElement old_password;

    @FindBy(how=How.XPATH, using="//*[@id=\"newPswInput\"]")
    public static WebElement new_password;

    @FindBy(how=How.XPATH, using="//*[@id=\"reNewPswInput\"]")
    public static WebElement renew_password;

    @FindBy(how=How.XPATH, using="//*[@type=\"submit\"]")
    public static WebElement submit_btn;

}
