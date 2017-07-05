package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.RongziBlueLoginPage;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by lining on 2017/7/3.
 */
public class RongziBlueLoginSteps extends StepDefs {

    @当("^输入用户信息$")
    public void 输入用户信息() throws Throwable {

        Actions action = new Actions(driver);

        PageFactory.initElements(driver, RongziBlueLoginPage.class);

        RongziBlueLoginPage.username.sendKeys("lining");

        List<WebElement> selects = RongziBlueLoginPage.selects;

        action.moveToElement(RongziBlueLoginPage.gender).perform();
        selects.get(1).click();
        Log.info("选择女士");

        action.moveToElement(RongziBlueLoginPage.identity).perform();
        selects.get(3).click();
        Log.info("选择企业主");

        action.moveToElement(RongziBlueLoginPage.loanMoney).perform();
        selects.get(7).click();
        Log.info("选择3");

        RongziBlueLoginPage.userMobile.sendKeys("18321950423");

    }

    @同时("^点击智能找贷款$")
    public void 点击智能找贷款() throws Throwable {

        RongziBlueLoginPage.search_money.click();

    }
}
