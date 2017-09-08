package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MOnekeyLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MOnekeyLoginSteps extends StepDefs{
    @并且("^输入极速贷款信息$")
    public void 输入极速贷款信息() throws Throwable {
        PageFactory.initElements(driver, MOnekeyLoginPage.class);
        MOnekeyLoginPage.username.sendKeys("li");
        MOnekeyLoginPage.mobile.sendKeys("18321950423");
        MOnekeyLoginPage.imgCode.sendKeys("1234");
        MOnekeyLoginPage.smsCode.sendKeys("123456");
    }

    @同时("^点击极速贷款$")
    public void 点击极速贷款() throws Throwable {
        PageFactory.initElements(driver, MOnekeyLoginPage.class);
        MOnekeyLoginPage.submit.click();
    }
}
