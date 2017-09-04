package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpYiXinOneLoginPage;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class LpYiXinOneLoginSteps extends StepDefs {

    @并且("^输入着陆页用户信息$")
    public void 输入着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpYiXinOneLoginPage.class);
        LpYiXinOneLoginPage.username.sendKeys("li");
        LpYiXinOneLoginPage.telphone.sendKeys("18321950423");

    }


    @同时("^点击宜信1着陆页立即申请$")
    public void 点击宜信one着陆页立即申请() throws Throwable {
        LpYiXinOneLoginPage.consult.click();
    }
}
