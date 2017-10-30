package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.MMinimalistLoginPage;
import com.rongzi.ms.pageobjects.web.lp.LpVehicleMortgageLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

import static com.rongzi.ms.pageobjects.BaseClass.driver;

/**
 * Created by Administrator on 2017/10/30 0030.
 */
public class MMinimalistLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在极简着陆页首页\"([^\"]*)\"$")
    public void 我在极简着陆页首页(String MMinimalistIndex) throws Throwable {
        driver.get(MMinimalistIndex);
    }

    @cucumber.api.java.zh_cn.并且("^输入jijian的信息$")
    public void 输入jijian的信息() throws Throwable {
        PageFactory.initElements(driver, MMinimalistLoginPage.class);
        MMinimalistLoginPage.shanghai.click();
        MMinimalistLoginPage.username.sendKeys("li");
        MMinimalistLoginPage.mobile.sendKeys("18321950423");
        MMinimalistLoginPage.imgCode.sendKeys("1234");
        MMinimalistLoginPage.smsCode.sendKeys("123456");

    }

    @cucumber.api.java.zh_cn.同时("^点击jijian的申请$")
    public void 点击jijian的申请() throws Throwable {
        MMinimalistLoginPage.submit.click();
    }





}
