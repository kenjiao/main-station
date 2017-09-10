package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MFeelingsLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MFeelingsLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.并且("^输入立即免费申请的信息$")
    public void 输入立即免费申请的信息() throws Throwable {
        PageFactory.initElements(driver, MFeelingsLoginPage.class);
        MFeelingsLoginPage.username.sendKeys("li");
        MFeelingsLoginPage.mobile.sendKeys("18321950423");
        MFeelingsLoginPage.imgCode.sendKeys("1234");
        MFeelingsLoginPage.smsCode.sendKeys("123456");


    }

    @cucumber.api.java.zh_cn.同时("^点击立即免费申请$")
    public void 点击立即免费申请() throws Throwable {
        PageFactory.initElements(driver, MFeelingsLoginPage.class);
        MFeelingsLoginPage.submit.click();

    }
}
