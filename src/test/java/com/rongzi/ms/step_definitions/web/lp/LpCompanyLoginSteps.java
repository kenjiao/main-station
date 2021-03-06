package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpCompanyLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class LpCompanyLoginSteps extends StepDefs {
   

    @并且("^输入企业着陆页用户信息$")
    public void 输入企业着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpCompanyLoginPage.class);
        LpCompanyLoginPage.username.sendKeys("li");
        LpCompanyLoginPage.mobile.sendKeys("18321950423");

    }

    @同时("^点击企业着陆页立即免费申请$")
    public void 点击企业着陆页立即免费申请() throws Throwable {
        PageFactory.initElements(driver, LpCompanyLoginPage.class);
        LpCompanyLoginPage.free_application.click();
    }

    @cucumber.api.java.zh_cn.当("^我点击免费申请$")
    public void 我点击免费申请() throws Throwable {
        PageFactory.initElements(driver, LpCompanyLoginPage.class);
        LpCompanyLoginPage.free_application_middle.click();
    }
}
