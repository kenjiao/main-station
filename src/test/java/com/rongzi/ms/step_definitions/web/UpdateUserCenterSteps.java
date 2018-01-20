package com.rongzi.ms.step_definitions.web;

import com.rongzi.ms.helpers.Log;
import com.rongzi.ms.pageobjects.web.UserCenterPage;
import com.rongzi.ms.pageobjects.web.UserCenterPage.BasicInformation;
import com.rongzi.ms.pageobjects.web.UserCenterPage.EAduitingInformation;
import com.rongzi.ms.step_definitions.StepDefs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 2018/1/20.
 */
public class UpdateUserCenterSteps extends StepDefs {
    private WebDriverWait wait = new WebDriverWait(driver, 5);

    @cucumber.api.java.zh_cn.那么("^成功转跳到个人中心页面$")
    public void 成功转跳到个人中心页面() throws Throwable {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        PageFactory.initElements(driver, UserCenterPage.class);
    }

    @cucumber.api.java.zh_cn.同时("^编辑需求书基本信息$")
    public void 编辑需求书基本信息() throws Throwable {
       wait.until(ExpectedConditions.visibilityOf(UserCenterPage.data_info.get(0)));
       if (UserCenterPage.edit_basic_info_btn.getText().matches("编辑")) {
            UserCenterPage.edit_basic_info_btn.click();
        }
        //编辑基本信息
        PageFactory.initElements(driver, BasicInformation.class);
        BasicInformation.user_name.clear();
        BasicInformation.user_name.sendKeys("ceshiyi");
        Log.info("姓名：ceshiyi");

        BasicInformation.age.clear();
        BasicInformation.age.sendKeys("20");
        Log.info("年龄：20");

        BasicInformation.woman.click();
        Log.info("性别：女");

        BasicInformation.education_btn.click();
        wait.until(ExpectedConditions.visibilityOf(BasicInformation.education.get(3))).click();
        Log.info("学历：硕士");

        BasicInformation.married_btn.click();
        wait.until(ExpectedConditions.visibilityOf(BasicInformation.married.get(1))).click();
        Log.info("婚姻状况：未婚");

        BasicInformation.live_time_btn.click();
        wait.until(ExpectedConditions.visibilityOf(BasicInformation.live_time.get(1))).click();
        Log.info("本市居住时长：3个月（含）-6个月");

        BasicInformation.identity_btn.click();
        wait.until(ExpectedConditions.visibilityOf(BasicInformation.identity.get(2))).click();
        Log.info("您的身份：个体户");

        Thread.sleep(1000 * 2);
        BasicInformation.submit.click();
    }

    @cucumber.api.java.zh_cn.并且("^进行打标签操作$")
    public void 进行打标签操作() throws Throwable {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(1000 * 2);
        PageFactory.initElements(driver, EAduitingInformation.class);

        EAduitingInformation.aduiting_btn.click();
        EAduitingInformation.aduiting_result.get(0).click();
        Log.info("电审结果：有需求已完善");

        EAduitingInformation.remarks.clear();
        EAduitingInformation.remarks.sendKeys("ceshi");
        Log.info("备注：ceshi");

        EAduitingInformation.aduiting_save_btn.click();
        Thread.sleep(1000 * 2);
    }

}
