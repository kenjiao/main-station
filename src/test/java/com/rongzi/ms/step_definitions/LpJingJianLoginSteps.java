package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpJingJianLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

/**
 * Created by lining on 2017/8/4.
 */
public class LpJingJianLoginSteps extends StepDefs{
    @假如("^我在精简cn着陆页首页\"([^\"]*)\"$")
    public void 我在精简cn着陆页首页(String LpJingJianIndex) throws Throwable {
        driver.get(LpJingJianIndex);
        PageFactory.initElements(driver,LpJingJianLoginPage.class);
    }

    @并且("^输入精简cn着陆页用户信息$")
    public void 输入精简cn着陆页用户信息() throws Throwable {
        LpJingJianLoginPage.username.sendKeys("li");
        LpJingJianLoginPage.mobile.sendKeys("18321950423");
    }

    @同时("^点击精简cn着陆页立即咨询$")
    public void 点击精简cn着陆页立即咨询() throws Throwable {
        PageFactory.initElements(driver,LpJingJianLoginPage.class);
        LpJingJianLoginPage.consult.click();
    }
}
