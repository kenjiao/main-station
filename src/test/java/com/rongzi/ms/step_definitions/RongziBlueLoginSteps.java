package com.rongzi.ms.step_definitions;

import com.rongzi.ms.pageobjects.RongziBlueLoginPage;
import cucumber.api.PendingException;
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
        RongziBlueLoginPage.username.sendKeys("li");


    }

    @同时("^点击智能找贷款$")
    public void 点击智能找贷款() throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    }
}
