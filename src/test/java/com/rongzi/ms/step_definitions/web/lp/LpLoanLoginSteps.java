package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.RongziAddressProceed;
import com.rongzi.ms.pageobjects.web.lp.LpLoanLoginPage;
import com.rongzi.ms.pageobjects.web.lp.LpLoanLoginPage.ConsultPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by lining on 2017/7/31.
 */
public class LpLoanLoginSteps extends StepDefs {

    @cucumber.api.java.zh_cn.假如("^我在贷款着陆页首页\"([^\"]*)\"$")
    public void 我在贷款着陆页首页(String LpLoanIndex) throws Throwable {
        driver.get(LpLoanIndex);
    }

    @并且("^输入贷款着陆页用户信息$")
    public void 输入贷款着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpLoanLoginPage.class);
        LpLoanLoginPage.username.sendKeys("li");
        LpLoanLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击贷款着陆页立即咨询$")
    public void 点击贷款着陆页立即咨询() throws Throwable {
        LpLoanLoginPage.consult.click();
    }


    @并且("^我点击马上借款$")
    public void 我点击马上借款() throws Throwable {
        PageFactory.initElements(driver, LpLoanLoginPage.class);
        LpLoanLoginPage.immediately_loan.click();
    }

    @当("^输入贷款的用户信息$")
    public void 输入贷款的用户信息() throws Throwable {

        PageFactory.initElements(driver, ConsultPage.class);

        ConsultPage.username.sendKeys("li");
        ConsultPage.mobile.sendKeys("18321950423");

        ConsultPage.salary.sendKeys("20000");

        Actions actions = new Actions(driver);
        actions.moveToElement(ConsultPage.house).perform();
        ConsultPage.houseSelects.get(0).click();

        actions.moveToElement(ConsultPage.car).perform();
        ConsultPage.carSelects.get(0).click();

        actions.moveToElement(ConsultPage.credit).perform();
        ConsultPage.creditSelects.get(0).click();

    }

    @同时("^点击立即咨询$")
    public void 点击立即咨询() throws Throwable {
        ConsultPage.consult.click();

    }



}
