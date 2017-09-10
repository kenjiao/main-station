package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MSupermarketLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MSupermarketLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.并且("^输入chaoshi的信息$")
    public void 输入chaoshi的信息() throws Throwable {
        PageFactory.initElements(driver,MSupermarketLoginPage.class);
        MSupermarketLoginPage.username.sendKeys("li");
        MSupermarketLoginPage.mobile.sendKeys("18321950423");
        MSupermarketLoginPage.imgCode.sendKeys("1234");
        MSupermarketLoginPage.smsCode.sendKeys("123456");




    }

    @cucumber.api.java.zh_cn.同时("^点击chaoshi的申请$")
    public void 点击chaoshi的申请() throws Throwable {
        MSupermarketLoginPage.submit.click();
    }
}
