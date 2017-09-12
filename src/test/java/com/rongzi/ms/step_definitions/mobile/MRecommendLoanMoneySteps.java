package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.pageobjects.mobile.MRecommendLoanMoneyPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MRecommendLoanMoneySteps extends StepDefs {


    @cucumber.api.java.zh_cn.那么("^成功进入M站测评页面$")
    public void 成功进入m站测评页面() throws Throwable {
        if ("dev".equals(Env.getProfile())) {
            WebDriverWait wait = new WebDriverWait(driver, 25);
            wait.until(driver -> driver.getCurrentUrl().contains("AssessStep2#/step2"));
        }
    }

    @cucumber.api.java.zh_cn.并且("^提交测评信息$")
    public void 提交测评信息() throws Throwable {
        if ("dev".equals(Env.getProfile())) {

            PageFactory.initElements(driver, MRecommendLoanMoneyPage.class);
            MRecommendLoanMoneyPage.loan_amount.click();
            MRecommendLoanMoneyPage.loan_amount.sendKeys("10");
            MRecommendLoanMoneyPage.loan_period.click();
            MRecommendLoanMoneyPage.loan_period.sendKeys("12");
            MRecommendLoanMoneyPage.submit.click();
        }
    }

    @cucumber.api.java.zh_cn.那么("^成功进入到M站测评结果页$")
    public void 成功进入到m站测评结果页() throws Throwable {
        if ("dev".equals(Env.getProfile())) {

            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(driver -> driver.getCurrentUrl().contains("AssessStep2#/step5"));
        }
    }
}
