package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpYiXinLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class LpYiXinLoginSteps extends StepDefs {

    @并且("^输入宜信着陆页用户信息$")
    public void 输入宜信着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver,LpYiXinLoginPage.class);
        LpYiXinLoginPage.username.sendKeys("li");
        LpYiXinLoginPage.telphone.sendKeys("18321950423");
    }


    @cucumber.api.java.zh_cn.同时("^点击宜信着陆页立即申请$")
    public void 点击宜信着陆页立即申请() throws Throwable {
        LpYiXinLoginPage.consult.click();
    }
}
