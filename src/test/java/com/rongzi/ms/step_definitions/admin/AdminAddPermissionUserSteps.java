package com.rongzi.ms.step_definitions.admin;

import com.rongzi.ms.pageobjects.admin.AdminPage;
import com.rongzi.ms.pageobjects.admin.AdminAddPermissionUserPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/19.
 */
public class AdminAddPermissionUserSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击权限管理下新增用户$")
    public void 点击权限管理下新增用户() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.permission_manage)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.add_permission_user)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入新增用户页面$")
    public void 进入新增用户页面() throws Throwable {
        PageFactory.initElements(driver, AdminAddPermissionUserPage.class);
    }

    @cucumber.api.java.zh_cn.并且("^输入信息$")
    public void 输入信息() throws Throwable {
        AdminAddPermissionUserPage.user_name.sendKeys("CS6927");
        AdminAddPermissionUserPage.nick_name.sendKeys("测试李");
        AdminAddPermissionUserPage.new_password.sendKeys("123456");
        AdminAddPermissionUserPage.renew_password.sendKeys("123456");
        wait.until(ExpectedConditions.elementToBeClickable(AdminAddPermissionUserPage.role_btn)).click();
        AdminAddPermissionUserPage.role.get(0).click();
    }

    @cucumber.api.java.zh_cn.同时("^单击确定$")
    public void 单击确定() throws Throwable {
        AdminAddPermissionUserPage.submit_btn.click();
    }
}
