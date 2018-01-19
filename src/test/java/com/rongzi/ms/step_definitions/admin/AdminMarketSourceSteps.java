package com.rongzi.ms.step_definitions.admin;

import com.rongzi.ms.pageobjects.admin.AdminPage;
import com.rongzi.ms.pageobjects.admin.AdminMarketSourcePage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/19.
 */
public class AdminMarketSourceSteps  extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.并且("^点击市场配置来源信息$")
    public void 点击市场配置来源信息() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.market_config)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AdminPage.source_info)).click();
    }

    @cucumber.api.java.zh_cn.那么("^进入来源信息页面$")
    public void 进入来源信息页面() throws Throwable {
        PageFactory.initElements(driver, AdminMarketSourcePage.class);
    }

    @cucumber.api.java.zh_cn.并且("^清空搜索栏并输入来源名称$")
    public void 清空搜索栏并输入来源名称() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminMarketSourcePage.clear_btn)).click();
        wait.until(ExpectedConditions.visibilityOf(AdminMarketSourcePage.source_name)).sendKeys("SEO");
    }

    @cucumber.api.java.zh_cn.同时("^单击搜索进行查询$")
    public void 单击搜索进行查询() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(AdminMarketSourcePage.search)).click();
    }

}
