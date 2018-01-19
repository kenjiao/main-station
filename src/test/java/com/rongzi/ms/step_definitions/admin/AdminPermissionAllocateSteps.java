package com.rongzi.ms.step_definitions.admin;

import com.rongzi.ms.pageobjects.admin.AdminPage;
import com.rongzi.ms.pageobjects.admin.AdminPermissionAllocatePage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/19.
 */
public class AdminPermissionAllocateSteps  extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击权限管理下权限分配$")
    public void 点击权限管理下权限分配() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.permission_manage)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.permission_allocat)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入权限分配页面$")
    public void 进入权限分配页面() throws Throwable {
        PageFactory.initElements(driver, AdminPermissionAllocatePage.class);
    }

    @cucumber.api.java.zh_cn.并且("^清空搜索栏并输入用户名$")
    public void 清空搜索栏并输入用户名() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminPermissionAllocatePage.clear_btn)).click();
        wait.until(ExpectedConditions.visibilityOf(AdminPermissionAllocatePage.user_name)).sendKeys("CS3574");
    }

    @cucumber.api.java.zh_cn.同时("^单击搜索进行权限管理查询$")
    public void 单击搜索进行权限管理查询() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminPermissionAllocatePage.search)).click();
    }
}
