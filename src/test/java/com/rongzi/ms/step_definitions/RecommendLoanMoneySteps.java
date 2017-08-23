package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.RecommendLoanProceed;
import com.rongzi.ms.pageobjects.RecommendLoanPage;
import com.rongzi.ms.pageobjects.RecommendLoanPage.ContactInfoPage;
import com.rongzi.ms.pageobjects.RecommendLoanPage.EvaluatePage;
import com.rongzi.ms.pageobjects.RecommendLoanPage.LoanInfoPage;
import com.rongzi.ms.pageobjects.RongziPage;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.rongzi.ms.pageobjects.RongziPage.easyLoan;


/**
 * Created by lining on 2017/7/10.
 */
public class RecommendLoanMoneySteps extends StepDefs {

    @当("^我点击我要申请$")
    public void 我点击我要申请() throws Throwable {

        PageFactory.initElements(driver, RongziPage.class);

        RongziPage.apply.click();
    }

    @那么("^跳转到智能贷，为您精准推荐优质贷款页面$")
    public void 跳转到智能贷为您精准推荐优质贷款页面() throws Throwable {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    @cucumber.api.java.zh_cn.同时("^填写联系方式$")
    public void 填写联系方式() throws Throwable {
        PageFactory.initElements(driver, RecommendLoanPage.class);
        PageFactory.initElements(driver, ContactInfoPage.class);
        PageFactory.initElements(driver, LoanInfoPage.class);
        PageFactory.initElements(driver, EvaluatePage.class);
        RecommendLoanProceed.execute(driver);
    }

    @当("^当我点击智能推荐处的免费体验$")
    public void 当我点击智能推荐处的免费体验() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        easyLoan.click();
    }

    @那么("^成功进入测评页面$")
    public void 成功进入测评页面() throws Throwable {
        if (Env.getProfile().equals("dev")) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(driver -> driver.getCurrentUrl().contains("quicktest/step2"));
        }
    }

    @并且("^点击快速选款$")
    public void 点击快速选款() throws Throwable {
        if (Env.getProfile().equals("dev")) {
            Actions action = new Actions(driver);

            LoanInfoPage.loanAmount.sendKeys("2");
            LoanInfoPage.loanPeriod.sendKeys("2");
            LoanInfoPage.identity.click();
            action.moveToElement(LoanInfoPage.incomeDistributionType).perform();
            LoanInfoPage.incomeDistributionTypes.get(0).click();
            action.moveToElement(LoanInfoPage.socialSecurityFund).perform();
            LoanInfoPage.socialSecurityFunds.get(0).click();
            LoanInfoPage.age.sendKeys("27");
            LoanInfoPage.quickLoan.click();
        }
    }

    @那么("^成功进入到测评结果页$")
    public void 成功进入到测评结果页() throws Throwable {
        if (Env.getProfile().equals("dev")) {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(driver -> driver.getCurrentUrl().contains("quicktest/step3"));
            PageFactory.initElements(driver, EvaluatePage.class);
            Assert.assertTrue(driver.getCurrentUrl().contains("quicktest/step3"));
        }
    }
}
