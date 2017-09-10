package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MYiXinLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MYinXinLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.并且("^输入立即借款的信息$")
    public void 输入立即借款的信息() throws Throwable {
        PageFactory.initElements(driver, MYiXinLoginPage.class);
        MYiXinLoginPage.username.sendKeys("li");
        MYiXinLoginPage.mobile.sendKeys("18321950423");
        MYiXinLoginPage.imgCode.sendKeys("1234");
        MYiXinLoginPage.smsCode.sendKeys("123456");


    }

    @cucumber.api.java.zh_cn.同时("^点击立即借款$")
    public void 点击立即借款() throws Throwable {
        PageFactory.initElements(driver, MYiXinLoginPage.class);
        MYiXinLoginPage.submit.click();

    }
}
