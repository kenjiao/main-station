package com.rongzi.ms.step_definitions.web;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.pageobjects.web.ConsignationPage;
import com.rongzi.ms.pageobjects.web.FinancingStrategyPage;
import com.rongzi.ms.pageobjects.web.RongziPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by lining on 2017/7/17.
 */
public class FinancingStrategySteps extends StepDefs {


    @当("^我点击融资攻略$")
    public void 我点击融资攻略() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        RongziPage.strategy.click();
    }

    @那么("^进入到融资攻略页面$")
    public void 进入到融资攻略页面() throws Throwable {
        PageFactory.initElements(driver, FinancingStrategyPage.class);

    }

    @同时("^在一键委托处填写个人信息$")
    public void 在一键委托处填写个人信息() throws Throwable {
        FinancingStrategyPage.username.sendKeys("li");
        FinancingStrategyPage.mobile.sendKeys("18321950423");

    }

    @当("^点击一键委托$")
    public void 点击一键委托() throws Throwable {
        FinancingStrategyPage.consignation.click();


    }

    @那么("^一键委托成功$")
    public void 一键委托成功() throws Throwable {
        PageFactory.initElements(driver, ConsignationPage.class);
        if (Env.getProfile().equals("dev")) {
            Assert.assertTrue(ConsignationPage.consignation_sucess.isDisplayed());
        }

    }
}
