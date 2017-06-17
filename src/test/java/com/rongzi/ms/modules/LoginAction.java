package com.rongzi.ms.modules;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.HappinessFrogPage;
import com.rongzi.ms.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

/**
 * Created by Yuan on 2017/6/17.
 */
public class LoginAction {

    public static void execute(WebDriver driver, String username, String password) {
        HappinessFrogPage.account.click();
        Log.info("Click the account button");
        HappinessFrogPage.login.click();
        Log.info("Click the login button");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(LoginPage.login_title));
        Log.info(" wait the login dialog open");

        LoginPage.username.sendKeys(username);
        Log.info(" is entered in UserName text box");
        LoginPage.password.sendKeys(password);
        Log.info(" is entered in Password text box");
        LoginPage.login.click();
        Log.info("Click action is performed on Submit button");

        wait.until(ExpectedConditions.visibilityOf(HappinessFrogPage.logged));
        Log.info(" wait the logged message");

        Assert.assertTrue(HappinessFrogPage.logged.getText().contains(username));

        Reporter.log("Login Action is successfully");
    }
}
