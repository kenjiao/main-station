package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MLoanLoginOnePage;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

public class MLoanOneLoginSteps {
    @cucumber.api.java.zh_cn.并且("^输入贷款one的信息$")
    public void 输入贷款one的信息() throws Throwable {
        PageFactory.initElements(driver,MLoanLoginOnePage.class);
        MLoanLoginOnePage.username.sendKeys("li");
        MLoanLoginOnePage.mobile.sendKeys("18321950423");
        MLoanLoginOnePage.imgCode.sendKeys("1234");
        MLoanLoginOnePage.smsCode.sendKeys("123456");

    }


    @cucumber.api.java.zh_cn.同时("^点击贷款one马上申请$")
    public void 点击贷款one马上申请() throws Throwable {
        MLoanLoginOnePage.submit.click();
    }
}
