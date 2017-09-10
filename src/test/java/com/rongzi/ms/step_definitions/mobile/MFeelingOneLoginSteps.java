package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MFeelingsOneLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

public class MFeelingOneLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.并且("^输入情怀one的信息$")
    public void 输入情怀one的信息() throws Throwable {
        PageFactory.initElements(driver, MFeelingsOneLoginPage.class);
        MFeelingsOneLoginPage.username.sendKeys("li");
        MFeelingsOneLoginPage.mobile.sendKeys("18321950423");
        MFeelingsOneLoginPage.imgCode.sendKeys("1234");
        MFeelingsOneLoginPage.smsCode.sendKeys("123456");



    }

    @cucumber.api.java.zh_cn.同时("^点击情怀one的申请$")
    public void 点击情怀one的申请() throws Throwable {
        MFeelingsOneLoginPage.submit.click();
    }
}
