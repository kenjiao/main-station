package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpOnePageLoginPage;
import com.rongzi.ms.pageobjects.LpOnePageLoginPage.LoanPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class LpOnePageLoginSteps extends StepDefs {
    @假如("^我在onepage着陆页首页\"([^\"]*)\"$")
    public void 我在onepage着陆页首页(String LpOnePageIndex) throws Throwable {
        driver.get(LpOnePageIndex);
    }


    @并且("^输入onepage着陆页用户信息$")
    public void 输入onepage着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpOnePageLoginPage.class);
        LpOnePageLoginPage.username.sendKeys("li");
        LpOnePageLoginPage.telphone.sendKeys("18321954023");
    }

    @同时("^点击onepage着陆页立即申请$")
    public void 点击onepage着陆页立即申请() throws Throwable {
        LpOnePageLoginPage.consult.click();
    }

    @那么("^贷款申请提交成功$")
    public void 贷款申请提交成功() throws Throwable {
        PageFactory.initElements(driver, LpOnePageLoginPage.class);

        // TODO: 2017/8/5 assert loan money submit success

    }

    @当("^点击立即免费咨询$")
    public void 点击立即免费咨询() throws Throwable {
        PageFactory.initElements(driver, LpOnePageLoginPage.class);
        LpOnePageLoginPage.free_consultation.click();

    }

    @同时("^就要输入onepage的cn着陆页贷款信息$")
    public void 就要输入onepage的cn着陆页贷款信息() throws Throwable {

        PageFactory.initElements(driver, LoanPage.class);

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(LoanPage.title));

        LoanPage.username.sendKeys("li");
        LoanPage.mobile.sendKeys("18321950423");
        LoanPage.imgCode.sendKeys("1234");
        LoanPage.smsCode.sendKeys("123456");

        Actions actions = new Actions(driver);
        actions.moveToElement(LoanPage.identity).perform();
        LoanPage.identitySelects.get(0).click();

        actions.moveToElement(LoanPage.loanMoney).perform();

        LoanPage.loanMoneySelects.get(0).click();


    }

}
