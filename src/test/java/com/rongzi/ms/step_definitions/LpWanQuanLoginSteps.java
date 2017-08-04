package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpWanQuanLoginPage;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/8/4.
 */
public class LpWanQuanLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在完全cn着陆页首页\"([^\"]*)\"$")
    public void 我在完全cn着陆页首页(String LpWanQuanIndex) throws Throwable {
        driver.get(LpWanQuanIndex);
        PageFactory.initElements(driver, LpWanQuanLoginPage.class);

    }

    @cucumber.api.java.zh_cn.并且("^输入完全cn着陆页用户信息$")
    public void 输入完全cn着陆页用户信息() throws Throwable {
        LpWanQuanLoginPage.username.sendKeys("li");
        LpWanQuanLoginPage.telphone.sendKeys("18321950423");

    }

    @cucumber.api.java.zh_cn.同时("^点击完全cn着陆页立即免费咨询$")
    public void 点击完全cn着陆页立即免费咨询() throws Throwable {
        LpWanQuanLoginPage.consult.click();
    }
}
