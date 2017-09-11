package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MEvaluateLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MEvaluateLoginSteps extends StepDefs {
    @cucumber.api.java.zh_cn.并且("^输入贷款的信息$")
    public void 输入贷款的信息() throws Throwable {
        PageFactory.initElements(driver, MEvaluateLoginPage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(MEvaluateLoginPage.loan_money)).click();
        Thread.sleep(3 * 1000);
        wait.until(ExpectedConditions.elementToBeClickable(MEvaluateLoginPage.money)).click();
        wait.until(ExpectedConditions.visibilityOf(MEvaluateLoginPage.username)).sendKeys("li");
        wait.until(ExpectedConditions.visibilityOf(MEvaluateLoginPage.cell_Phone)).sendKeys("18321950423");
        wait.until(ExpectedConditions.visibilityOf(MEvaluateLoginPage.imgCode)).sendKeys("1234");
        wait.until(ExpectedConditions.visibilityOf(MEvaluateLoginPage.SmsCode)).sendKeys("123456");

    }

    @cucumber.api.java.zh_cn.同时("^点击evaluate的极速贷款$")
    public void 点击evaluate的极速贷款() throws Throwable {
        MEvaluateLoginPage.submit.click();
    }
}
