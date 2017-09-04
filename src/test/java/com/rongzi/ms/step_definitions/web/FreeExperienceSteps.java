package com.rongzi.ms.step_definitions.web;

import com.rongzi.ms.pageobjects.web.FreeExperiencePage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class FreeExperienceSteps extends StepDefs {
    @那么("^就要输入免费申请的个人信息$")
    public void 就要输入免费申请的个人信息() throws Throwable {
        PageFactory.initElements(driver,FreeExperiencePage.class);
        FreeExperiencePage.username.sendKeys("li");
        FreeExperiencePage.mobile.sendKeys("18321950423");
        FreeExperiencePage.captcha.sendKeys("1234");
        FreeExperiencePage.smscode.sendKeys("123456");
    }

    @同时("^点击提交$")
    public void 点击提交() throws Throwable {
        PageFactory.initElements(driver,FreeExperiencePage.class);
        FreeExperiencePage.submit.click();

    }
}
