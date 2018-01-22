package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.pageobjects.web.admin.AdminModifyPwdPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/22.
 */
public class AdminModifyPwdSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击系统管理下修改密码$")
    public void 点击系统管理下修改密码() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.system_manager)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.modify_pwd)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入修改密码页面$")
    public void 进入修改密码页面() throws Throwable {
        PageFactory.initElements(driver, AdminModifyPwdPage.class);
    }

    @cucumber.api.java.zh_cn.并且("^输入密码信息$")
    public void 输入密码信息() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(AdminModifyPwdPage.old_password)).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOf(AdminModifyPwdPage.new_password)).sendKeys("123456");
        wait.until(ExpectedConditions.visibilityOf(AdminModifyPwdPage.renew_password)).sendKeys("123456");
    }

    @cucumber.api.java.zh_cn.同时("^单击确定按钮提交$")
    public void 单击确定按钮提交() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminModifyPwdPage.submit_btn)).click();
    }
}
