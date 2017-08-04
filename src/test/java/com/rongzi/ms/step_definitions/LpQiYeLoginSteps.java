package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpQiyeLoginPage;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/8/4.
 */
public class LpQiYeLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在企业cn着陆页首页\"([^\"]*)\"$")
    public void 我在企业cn着陆页首页(String LpQiYeIndex) throws Throwable {
        driver.get(LpQiYeIndex);
        PageFactory.initElements(driver, LpQiyeLoginPage.class);
    }

    @cucumber.api.java.zh_cn.并且("^输入企业cn着陆页用户信息$")
    public void 输入企业cn着陆页用户信息() throws Throwable {
        LpQiyeLoginPage.username.sendKeys("li");
        LpQiyeLoginPage.mobile.sendKeys("18321950423");
    }

    @cucumber.api.java.zh_cn.同时("^点击企业cn着陆页立即免费申请$")
    public void 点击企业cn着陆页立即免费申请() throws Throwable {
        LpQiyeLoginPage.free_application.click();
    }
}
