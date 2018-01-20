package com.rongzi.ms.step_definitions.web.admin;

import com.rongzi.ms.pageobjects.web.admin.AdminPage;
import com.rongzi.ms.pageobjects.web.admin.AdminRegisterSourcePage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Created by Administrator on 2018/1/19.
 */
public class AdminRegisterSourceSteps  extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.同时("^点击数据统计下注册来源统计$")
    public void 点击数据统计下注册来源统计() throws Throwable {
        PageFactory.initElements(driver, AdminPage.class);
        if (!driver.getTitle().matches("RegisterSource")){
            wait.until(ExpectedConditions.elementToBeClickable(AdminPage.data_statistic)).click();
            wait.until(ExpectedConditions.elementToBeClickable(AdminPage.register_source_statistic)).click();
        }else{
            Reporter.log("the current page is register source");
        }
    }

    @cucumber.api.java.zh_cn.那么("^进入注册来源统计页面$")
    public void 进入注册来源统计页面() throws Throwable {
        PageFactory.initElements(driver, AdminRegisterSourcePage.class);
    }

    @cucumber.api.java.zh_cn.并且("^点击注册来源统计页面搜索按钮$")
    public void 点击注册来源统计页面搜索按钮() throws Throwable {
        AdminRegisterSourcePage.register_platform_btn.click();
        AdminRegisterSourcePage.register_platform.get(1).click();
        wait.until(ExpectedConditions.visibilityOf(AdminRegisterSourcePage.page_size)).clear();
        AdminRegisterSourcePage.page_size.sendKeys("5");
        wait.until(ExpectedConditions.elementToBeClickable(AdminRegisterSourcePage.search)).click();
    }
}
