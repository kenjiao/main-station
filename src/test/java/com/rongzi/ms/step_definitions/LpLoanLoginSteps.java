package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LpLoanLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

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
}
