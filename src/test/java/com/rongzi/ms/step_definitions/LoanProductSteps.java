package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.LoanProductPage;
import com.rongzi.ms.pageobjects.RongziPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Administrator on 2017/7/18 0018.
 */
public class LoanProductSteps extends StepDefs {
    @当("^点击贷款产品$")
    public void 点击贷款产品() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        RongziPage.loan_product.click();

    }

    @那么("^进入到产品列表页$")
    public void 进入到产品列表页() throws Throwable {
        PageFactory.initElements(driver, LoanProductPage.class);


    }

    @同时("^输入个人信息$")
    public void 输入个人信息() throws Throwable {
        LoanProductPage.username.sendKeys("li");
        LoanProductPage.mobile.sendKeys("18321950423");
    }

    @并且("^点击免费体验$")
    public void 点击免费体验() throws Throwable {
        LoanProductPage.free_experience.click();
    }


    @同时("^点击产品详情$")
    public void 点击产品详情() throws Throwable {
        PageFactory.initElements(driver, LoanProductPage.class);
        LoanProductPage.product_details.click();
    }

}
