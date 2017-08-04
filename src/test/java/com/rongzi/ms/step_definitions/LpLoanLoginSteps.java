package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.LpLoanLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

/**
 * Created by lining on 2017/7/31.
 */
public class LpLoanLoginSteps extends StepDefs {
    @假如("^我在贷款着陆页首页\"([^\"]*)\"$")
    public void 我在贷款着陆页首页(String lpLoanIndex) throws Throwable {
        driver.get(lpLoanIndex);
        PageFactory.initElements(driver,LpLoanLoginPage.class);
    }

    @并且("^输入贷款着陆页用户信息$")
    public void 输入贷款着陆页用户信息() throws Throwable {
        LpLoanLoginPage.username.sendKeys("li");
        LpLoanLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击贷款着陆页立即咨询$")
    public void 点击贷款着陆页立即咨询() throws Throwable {
        LpLoanLoginPage.consult.click();
    }


    @并且("^我点击马上借款$")
    public void 我点击马上借款() throws Throwable {
        PageFactory.initElements(driver,LpLoanLoginPage.class);
        LpLoanLoginPage.immediately_loan.click();
    }

    @cucumber.api.java.zh_cn.当("^输入贷款的用户信息$")
    public void 输入贷款的用户信息() throws Throwable {



    }

    @cucumber.api.java.zh_cn.同时("^点击立即咨询$")
    public void 点击立即咨询() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
