package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpOnePageLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class LpOnePageLoginSteps extends StepDefs{
    @假如("^我在onepage着陆页首页\"([^\"]*)\"$")
    public void 我在onepage着陆页首页(String LpOnePageIndex) throws Throwable {
        driver.get(LpOnePageIndex);
        PageFactory.initElements(driver, LpOnePageLoginPage.class);
    }


    @并且("^输入onepage着陆页用户信息$")
    public void 输入onepage着陆页用户信息() throws Throwable {
        LpOnePageLoginPage.username.sendKeys("li");
        LpOnePageLoginPage.telphone.sendKeys("18321954023");
    }

    @同时("^点击onepage着陆页立即申请$")
    public void 点击onepage着陆页立即申请() throws Throwable {
        LpOnePageLoginPage.consult.click();
    }

    @那么("^贷款申请提交成功$")
    public void 贷款申请提交成功() throws Throwable {
        PageFactory.initElements(driver,LpOnePageLoginPage.class);

    }

    @同时("^点击立即免费咨询$")
    public void 点击立即免费咨询() throws Throwable {
        PageFactory.initElements(driver,LpOnePageLoginPage.class);
        LpOnePageLoginPage.free_consultation.click();

    }

    @cucumber.api.java.zh_cn.那么("^就要输入onepage的cn着陆页贷款信息$")
    public void 就要输入onepage的cn着陆页贷款信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.同时("^点击获取验证码$")
    public void 点击获取验证码() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.并且("^输入验证码信息$")
    public void 输入验证码信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.同时("^点击提交验证吗信息$")
    public void 点击提交验证吗信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
