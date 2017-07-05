package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.RightIntelligentLoanPage;
import com.rongzi.ms.pageobjects.VerifyCodePage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

/**
 * Created by lining on 2017/7/5.
 */
public class IntelligentLoanSteps extends StepDefs {

    @当("^填写右部智能贷款个人信息$")
    public void 填写右部智能贷款个人信息() throws Throwable {
        Actions action = new Actions(driver);

        PageFactory.initElements(driver, RightIntelligentLoanPage.class);

        RightIntelligentLoanPage.username.sendKeys("lining");

        List<WebElement> selects = RightIntelligentLoanPage.selects;

        action.moveToElement(RightIntelligentLoanPage.gender).perform();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement female = selects.get(1);
        wait.until(ExpectedConditions.visibilityOf(female));
        female.click();
        Log.info("选择女士");

        action.moveToElement(RightIntelligentLoanPage.identity).perform();
        WebElement enterprise = selects.get(3);
        wait.until(ExpectedConditions.visibilityOf(enterprise));
        enterprise.click();
        Log.info("选择企业主");

        action.moveToElement(RightIntelligentLoanPage.loanMoney).perform();
        WebElement three = selects.get(7);
        wait.until(ExpectedConditions.visibilityOf(three));
        three.click();
        Log.info("选择3");

        RightIntelligentLoanPage.userMobile.sendKeys("18321950423");
    }

    @并且("^点击右部免费智能贷款$")
    public void 点击右部免费智能贷款() throws Throwable {
        RightIntelligentLoanPage.search_money.click();
    }


    @当("^填写中部智能贷款个人信息$")
    public void 填写中部智能贷款个人信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @并且("^点击中部免费智能贷款$")
    public void 点击中部免费智能贷款() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @当("^填写底部智能贷款个人信息$")
    public void 填写底部智能贷款个人信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @并且("^点击底部免费智能贷款$")
    public void 点击底部免费智能贷款() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @那么("^成功进入测评页面$")
    public void 成功进入测评页面() throws Throwable {
        WebElement element = driver.findElement(By.xpath("//div[text()=\"验证码错误\"] "));
        Assert.assertTrue(element.isDisplayed());
    }
}
