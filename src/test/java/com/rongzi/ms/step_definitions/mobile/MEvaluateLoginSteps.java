package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MEvaluateLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

/**
 * Created by Administrator on 2017/9/7 0007.
 */
public class MEvaluateLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.并且("^输入贷款的信息$")
    public void 输入贷款的信息() throws Throwable {
        PageFactory.initElements(driver,MEvaluateLoginPage.class);
        MEvaluateLoginPage.loan_money.click();
        MEvaluateLoginPage.money.click();
        MEvaluateLoginPage.username.sendKeys("li");
        MEvaluateLoginPage.cell_Phone.sendKeys("18321950423");
        MEvaluateLoginPage.imgCode.sendKeys("1234");
        MEvaluateLoginPage.SmsCode.sendKeys("123456");
    }

    @cucumber.api.java.zh_cn.同时("^点击evaluate的极速贷款$")
    public void 点击evaluate的极速贷款() throws Throwable {
        PageFactory.initElements(driver,MEvaluateLoginPage.class);
        MEvaluateLoginPage.submit.click();
    }
}
