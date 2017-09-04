package com.rongzi.ms.step_definitions;

import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.pageobjects.LpCompanyLoginPage;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class LpCompanyLoginSteps extends StepDefs {
    @假如("^我在企业着陆页首页\"([^\"]*)\"$")
    public void 我在企业着陆页首页(String lpCompanyIndex) throws Throwable {
        LpLoginPageProceed.open(driver, lpCompanyIndex);
        PageFactory.initElements(driver, LpCompanyLoginPage.class);
    }

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
        LpCompanyLoginPage.free_application1.click();
    }
}
