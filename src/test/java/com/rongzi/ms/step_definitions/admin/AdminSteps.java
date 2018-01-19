package com.rongzi.ms.step_definitions.admin;

import com.rongzi.ms.pageobjects.admin.AdminPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Administrator on 2018/1/17.
 */
public class AdminSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.那么("^进入admin页面\"([^\"]*)\"$")
    public void 进入admin页面() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.visibilityOf(AdminPage.login_user_name));
        Reporter.log("Admin page login successful");
    }

    @cucumber.api.java.zh_cn.并且("^退出登陆$")
    public void 退出登陆() throws Throwable {
        AdminPage.log_out.click();
    }

    @cucumber.api.java.zh_cn.那么("^返回登陆页面$")
    public void 返回登陆页面() throws Throwable {
        Assert.assertTrue(driver.getCurrentUrl().matches("http://admin.rongzi.com/User/Login"));
    }

}
