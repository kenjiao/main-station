package com.rongzi.ms.step_definitions;

import com.rongzi.ms.modules.RecommendLoanProceed;
import com.rongzi.ms.pageobjects.RecommendLoanPage;
import com.rongzi.ms.pageobjects.RongziPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/10.
 */
public class RecommendLoanMoneySteps extends StepDefs{

    @cucumber.api.java.zh_cn.当("^我点击我要申请$")
    public void 我点击我要申请() throws Throwable {

        PageFactory.initElements(driver, RongziPage.class);

        RongziPage.apply.click();
    }

    @cucumber.api.java.zh_cn.那么("^跳转到智能贷，为您精准推荐优质贷款页面$")
    public void 跳转到智能贷为您精准推荐优质贷款页面() throws Throwable {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    @cucumber.api.java.zh_cn.同时("^填写联系方式$")
    public void 填写联系方式() throws Throwable {
        PageFactory.initElements(driver, RecommendLoanPage.class);
        PageFactory.initElements(driver, RecommendLoanPage.ContactInfoPage.class);
        PageFactory.initElements(driver, RecommendLoanPage.LoanInfoPage.class);
        PageFactory.initElements(driver, RecommendLoanPage.EvaluatePage.class);
        RecommendLoanProceed.execute(driver);
    }

    @cucumber.api.java.zh_cn.当("^当我点击智能推荐处的免费体验$")
    public void 当我点击智能推荐处的免费体验() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        RongziPage.easyLoan.click();
    }
}
