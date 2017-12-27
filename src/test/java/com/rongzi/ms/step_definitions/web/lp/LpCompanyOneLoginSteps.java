package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpCompanyOneLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/12/5 0005.
 */
public class LpCompanyOneLoginSteps extends StepDefs{

    @cucumber.api.java.zh_cn.并且("^输入企业one着陆页用户信息$")
    public void 输入企业one着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpCompanyOneLoginPage.class);
        LpCompanyOneLoginPage.username.sendKeys("li");
        LpCompanyOneLoginPage.mobile.sendKeys("18321950423");
    }

    @cucumber.api.java.zh_cn.同时("^点击企业one着陆页立即免费申请$")
    public void 点击企业one着陆页立即免费申请() throws Throwable {
        LpCompanyOneLoginPage.free_application.click();
    }


    @cucumber.api.java.zh_cn.并且("^点击中部免费申请$")
    public void 点击中部免费申请() throws Throwable {
        PageFactory.initElements(driver, LpCompanyOneLoginPage.class);
        LpCompanyOneLoginPage.free_middle_application.click();
    }


    @cucumber.api.java.zh_cn.同时("^填写免费申请信息$")
    public void 填写免费申请信息() throws Throwable {
        PageFactory.initElements(driver, LpCompanyOneLoginPage.NextPage.class);
        LpCompanyOneLoginPage.NextPage.username.sendKeys("li");
        LpCompanyOneLoginPage.NextPage.mobile.sendKeys("18321950423");
        LpCompanyOneLoginPage.NextPage.verification_code.sendKeys("1234");
        LpCompanyOneLoginPage.NextPage.sms_code.sendKeys("123456");
        LpCompanyOneLoginPage.NextPage.next.click();
    }

    @cucumber.api.java.zh_cn.并且("^点击底部免费申请$")
    public void 点击底部免费申请() throws Throwable {
        LpCompanyOneLoginPage.free_bottom_application.click();
    }
}

