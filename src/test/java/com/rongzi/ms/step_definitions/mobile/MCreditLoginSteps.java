package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MCreditLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

public class MCreditLoginSteps extends StepDefs{
    @并且("^输入信用信息$")
    public void 输入信用信息() throws Throwable {
        PageFactory.initElements(driver,MCreditLoginPage.class);
        MCreditLoginPage.username.sendKeys("li");
        MCreditLoginPage.mobile.sendKeys("18321950423");
        MCreditLoginPage.smsCode.sendKeys("123456");


    }

    @同时("^点击免费申请贷款$")
    public void 点击免费申请贷款() throws Throwable {
        MCreditLoginPage.submit.click();
    }
}

