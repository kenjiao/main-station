package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpSimpleLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/31.
 */
public class LpSimpleLoginSteps extends StepDefs{

    @假如("^我在精简着陆页首页\"([^\"]*)\"$")
    public void 我在精简着陆页首页(String LpSimpleIndex) throws Throwable {
        driver.get(LpSimpleIndex);
        PageFactory.initElements(driver, LpSimpleLoginPage.class);
    }

    @并且("^输入精简着陆页用户信息$")
    public void 输入精简着陆页用户信息() throws Throwable {
        LpSimpleLoginPage.username.sendKeys("li");
        LpSimpleLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击精简着陆页立即咨询$")
    public void 点击精简着陆页立即咨询() throws Throwable {
        LpSimpleLoginPage.consult.click();
    }


    @当("^点击我要申请$")
    public void 点击我要申请() throws Throwable {
        PageFactory.initElements(driver,LpSimpleLoginPage.class);
        LpSimpleLoginPage.application.click();
    }


}
