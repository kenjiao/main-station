package com.rongzi.ms.modules;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.HappinessFrogPage;
import com.rongzi.ms.pageobjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

/**
 * Created by Yuan on 2017/6/17.
 */
public class LogoutAction {

    public static void execute(WebDriver driver) {
        HappinessFrogPage.account.click();
        Log.info("Click the account button");
        HappinessFrogPage.logout.click();
        Log.info("Click the logout button");

        Reporter.log("Log out is successful");
    }
}
