package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpCompletelyLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/31.
 */
public class LpCompletelyLoginSteps extends StepDefs{
    @假如("^我在完全着陆页首页\"([^\"]*)\"$")
    public void 我在完全着陆页首页(String LpCompletelyIndex) throws Throwable {
        driver.get(LpCompletelyIndex);
        PageFactory.initElements(driver, LpCompletelyLoginPage.class);
    }

    @并且("^输入完全着陆页用户信息$")
    public void 输入完全着陆页用户信息() throws Throwable {
        LpCompletelyLoginPage.username.sendKeys("li");
        LpCompletelyLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击完全着陆页立即免费咨询$")
    public void 点击完全着陆页立即免费咨询() throws Throwable {
        LpCompletelyLoginPage.consult.click();
    }
}
