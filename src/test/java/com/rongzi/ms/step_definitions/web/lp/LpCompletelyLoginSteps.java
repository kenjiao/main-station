package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpCompletelyLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/31.
 */
public class LpCompletelyLoginSteps extends StepDefs {

    @并且("^输入完全着陆页用户信息$")
    public void 输入完全着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpCompletelyLoginPage.class);
        LpCompletelyLoginPage.username.sendKeys("li");
        LpCompletelyLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击完全着陆页立即免费咨询$")
    public void 点击完全着陆页立即免费咨询() throws Throwable {
        LpCompletelyLoginPage.consult.click();
    }

    @当("^填写智能贷款个人信息$")
    public void 填写智能贷款个人信息() throws Throwable {
        PageFactory.initElements(driver,LpCompletelyLoginSteps.class);
        LpCompletelyLoginPage.username3.sendKeys("li");
        LpCompletelyLoginPage.mobile3.sendKeys("18321950423");
    }

    @并且("^点击免费智能贷款$")
    public void 点击免费智能贷款() throws Throwable {
        PageFactory.initElements(driver,LpCompletelyLoginPage.class);
        LpCompletelyLoginPage.free_experience.click();
    }

    @当("^我点击我也要免费申请$")
    public void 我点击我也要免费申请() throws Throwable {
        PageFactory.initElements(driver,LpCompletelyLoginPage.class);
        LpCompletelyLoginPage.free_experience1.click();
    }


}
