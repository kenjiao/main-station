package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MLoanConsultLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MLoanConsultLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.并且("^输入贷款咨询的信息$")
    public void 输入贷款咨询的信息() throws Throwable {
        PageFactory.initElements(driver,MLoanConsultLoginPage.class);
        MLoanConsultLoginPage.username.sendKeys("li");
        MLoanConsultLoginPage.mobile.sendKeys("18321950423");
        MLoanConsultLoginPage.imgCode.sendKeys("1234");
        MLoanConsultLoginPage.smsCode.sendKeys("123456");



    }

    @cucumber.api.java.zh_cn.同时("^点击贷款咨询申请$")
    public void 点击贷款咨询申请() throws Throwable {
        MLoanConsultLoginPage.submit.click();
    }
}
