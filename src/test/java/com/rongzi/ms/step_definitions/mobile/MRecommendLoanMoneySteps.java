package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MRecommendLoanMoneyPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MRecommendLoanMoneySteps extends StepDefs{


    @并且("^填写个人资料$")
    public void 填写个人资料() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 25);
        wait.until(driver -> driver.getCurrentUrl().contains("AssessStep2#/step2"));
        PageFactory.initElements(driver, MRecommendLoanMoneyPage.class);
        MRecommendLoanMoneyPage.loan_amount.click();
        MRecommendLoanMoneyPage.loan_amount.sendKeys("10");
        MRecommendLoanMoneyPage.loan_period.click();
        MRecommendLoanMoneyPage.loan_period.sendKeys("12");

    }

    @同时("^点击确认提交$")
    public void 点击确认提交() throws Throwable {
       MRecommendLoanMoneyPage.submit.click();
    }

    @那么("^成功进入到M站测评结果页$")
    public void 成功进入到m站测评结果页() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(driver -> driver.getCurrentUrl().contains("AssessStep2#/step5"));

    }
}
