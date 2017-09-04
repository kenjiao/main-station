package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.web.VerifyCodePage;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by lining on 2017/7/5.
 */
public class VerifyCodeSteps extends StepDefs {


    @那么("^就要输入验证码$")
    public void 就要输入验证码() throws Throwable {
        PageFactory.initElements(driver, VerifyCodePage.class);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(VerifyCodePage.verify_code_title));
        VerifyCodePage.captcha.sendKeys("1234");
        VerifyCodePage.smscode.sendKeys("123456");
    }

    @并且("^我点击提交验证码$")
    public void 我点击提交验证码() throws Throwable {
        VerifyCodePage.submit.click();
    }
}
