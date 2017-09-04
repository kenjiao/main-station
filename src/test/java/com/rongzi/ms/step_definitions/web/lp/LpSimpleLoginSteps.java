package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpSimpleLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/31.
 */
public class LpSimpleLoginSteps extends StepDefs {

    @并且("^输入精简着陆页用户信息$")
    public void 输入精简着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpSimpleLoginPage.class);
        LpSimpleLoginPage.username.sendKeys("li");
        LpSimpleLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击精简着陆页立即咨询$")
    public void 点击精简着陆页立即咨询() throws Throwable {
        LpSimpleLoginPage.consult.click();
    }


    @当("^点击我要申请$")
    public void 点击我要申请() throws Throwable {
        LpSimpleLoginPage.application.click();
    }


}
