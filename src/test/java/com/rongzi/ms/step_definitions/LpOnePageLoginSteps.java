package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpOnePageLoginPage;
import cucumber.api.PendingException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class LpOnePageLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在onepage着陆页首页\"([^\"]*)\"$")
    public void 我在onepage着陆页首页(String LpOnePageIndex) throws Throwable {
        driver.get(LpOnePageIndex);
        PageFactory.initElements(driver, LpOnePageLoginPage.class);
    }


    @cucumber.api.java.zh_cn.并且("^输入onepage着陆页用户信息$")
    public void 输入onepage着陆页用户信息() throws Throwable {
        LpOnePageLoginPage.username.sendKeys("li");
        LpOnePageLoginPage.telphone.sendKeys("18321954023");
    }

    @cucumber.api.java.zh_cn.同时("^点击onepage着陆页立即申请$")
    public void 点击onepage着陆页立即申请() throws Throwable {
        LpOnePageLoginPage.consult.click();
    }

    @cucumber.api.java.zh_cn.那么("^贷款申请提交成功$")
    public void 贷款申请提交成功() throws Throwable {

    }
}
