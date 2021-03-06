package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.MLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.CurrentPage;
import com.rongzi.ms.pageobjects.mobile.MCityPage;
import com.rongzi.ms.pageobjects.mobile.MLoanLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MLoanLoginSteps extends StepDefs {

    WebDriverWait wait = new WebDriverWait(driver, 10);

    @假如("^我在\"([^\"]*)\"着陆页$")
    public void 我在着陆页(String suffix) throws Throwable {
        String city = Env.getProperty("rongzi.city", "上海");
        MLoginPageProceed.open(driver, Env.getProperty("rongzi.index"), suffix);


        PageFactory.initElements(driver, CurrentPage.class);
        wait.until(ExpectedConditions.elementToBeClickable(CurrentPage.currentCity));
        CurrentPage.currentCity.click();

        PageFactory.initElements(driver, MCityPage.class);
        Thread.sleep(3 * 1000);
        wait.until(ExpectedConditions.visibilityOfAllElements(MCityPage.cities));
        for (WebElement element : MCityPage.cities) {
            if (element.getText().equals(city)) {
                element.click();
                return;
            }

        }

    }

    @并且("^输入贷款信息$")
    public void 输入贷款信息() throws Throwable {
        PageFactory.initElements(driver, MLoanLoginPage.class);
        wait.until(ExpectedConditions.visibilityOf(MLoanLoginPage.username));

        MLoanLoginPage.username.sendKeys("li");
        MLoanLoginPage.mobile.sendKeys("18321950423");
        MLoanLoginPage.imgCode.sendKeys("1234");
        MLoanLoginPage.smsCode.sendKeys("123456");
    }

    @同时("^点击马上申请$")
    public void 点击马上申请() throws Throwable {
        MLoanLoginPage.submit.click();
    }





}
