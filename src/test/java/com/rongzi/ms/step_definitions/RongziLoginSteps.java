package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.RongziLoginPage;
import com.rongzi.ms.pageobjects.RongziPage;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/**
 * Created by lining on 2017/6/28.
 */
public class RongziLoginSteps extends StepDefs {


    @当("^点击请登陆按钮$")
    public void 点击请登陆按钮() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        RongziPage.login_please.click();

    }

    @那么("^进入登陆页面$")
    public void 进入登陆页面() throws Throwable {
        PageFactory.initElements(driver, RongziLoginPage.class);

    }

    @假如("^点击登陆按钮$")
    public void 点击登陆按钮() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        RongziLoginPage.login.click();
    }

    @并且("^填写登陆信息$")
    public void 填写登陆信息() throws Throwable {
        RongziLoginPage.telephone.sendKeys("18321950423");
        RongziLoginPage.password.sendKeys("yzc32323232");
        RongziLoginPage.verCode.sendKeys("1111");
    }

    @那么("^登陆成功$")
    public void 登陆成功() throws Throwable {
        Assert.assertTrue(driver.getCurrentUrl().equals("http://www.rongzi.com/account/login"));
    }
}
