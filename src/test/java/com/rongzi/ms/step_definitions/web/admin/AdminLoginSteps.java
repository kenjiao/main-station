package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminLoginPage;
import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Created by Administrator on 2018/1/17.
 */
public class AdminLoginSteps extends StepDefs {
    @cucumber.api.java.zh_cn.假如("^我admin登陆页\"([^\"]*)\"$")
    public void 我admin登陆页(String AdminIndex) throws Throwable {
        driver.get(AdminIndex);
    }

    @cucumber.api.java.zh_cn.并且("^输入登录信息$")
    public void 输入登录信息() throws Throwable {
        PageFactory.initElements(driver, AdminLoginPage.class);
        AdminLoginPage.username.sendKeys("CS6927");
        AdminLoginPage.password.sendKeys("123456");
        WebDriverWait wait = new WebDriverWait(driver, 20);
    }

    @cucumber.api.java.zh_cn.同时("^单击登陆按钮$")
    public void 单击登陆按钮() throws Throwable {
        AdminLoginPage.login_button.click();
    }

    @cucumber.api.java.zh_cn.那么("^登陆成功$")
    public void 登陆成功() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
    }
}
