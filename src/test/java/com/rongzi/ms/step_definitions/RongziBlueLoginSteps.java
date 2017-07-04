package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.RongziBlueLoginPage;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.By;
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

        action.moveToElement(RongziBlueLoginPage.gender).perform();


        List<WebElement> genders = RongziBlueLoginPage.gender.findElements(By.cssSelector("li"));

        // 女士
        genders.get(1).click();

        action.moveToElement(RongziBlueLoginPage.userIdentity).perform();

        List<WebElement> identities = RongziBlueLoginPage.identitySelects.findElements(By.cssSelector("li"));

        identities.get(0).click();

        action.moveToElement(RongziBlueLoginPage.loanMoney).perform();

        List<WebElement> money = RongziBlueLoginPage.loanMoneySelects.findElements(By.cssSelector("li"));

        // 1 万元
        money.get(0).click();

        RongziBlueLoginPage.userMobile.sendKeys("18321950423");

    }

    @同时("^点击智能找贷款$")
    public void 点击智能找贷款() throws Throwable {

        RongziBlueLoginPage.search_money.click();

    }
}
