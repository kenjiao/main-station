package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.pageobjects.mobile.CurrentPage;
import com.rongzi.ms.pageobjects.mobile.MCepingLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Function;

import static com.rongzi.ms.pageobjects.mobile.MCepingLoginPage.identity;

public class MCepingLoginSteps extends StepDefs {

    private WebDriverWait wait = new WebDriverWait(driver, 10);

    @cucumber.api.java.zh_cn.假如("^我在测评着陆页首页\"([^\"]*)\"$")
    public void 我在测评着陆页首页(String MCepingIndex) throws Throwable {
        driver.get(MCepingIndex);
    }


    @cucumber.api.java.zh_cn.并且("^点击开始测试$")
    public void 点击开始测试() throws Throwable {
        PageFactory.initElements(driver, MCepingLoginPage.class);
        MCepingLoginPage.start_test.click();

    }

    @cucumber.api.java.zh_cn.同时("^输入ceping的信息$")
    public void 输入ceping的信息() throws Throwable {
        PageFactory.initElements(driver, MCepingLoginPage.class);

        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.loan_money)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.identity)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.age)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.income_type)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.salary)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.social_fund)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.working_year)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.credit)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.house)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.car)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.insurance)).click();

    }

    @cucumber.api.java.zh_cn.那么("^输入注册信息$")
    public void 输入注册信息() throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(MCepingLoginPage.username)).sendKeys("li");
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.city)).click();
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.shanghai)).click();
        wait.until(ExpectedConditions.visibilityOf(MCepingLoginPage.telphone)).sendKeys("18321950423");
        wait.until(ExpectedConditions.visibilityOf(MCepingLoginPage.image_code)).sendKeys("1234");
        wait.until(ExpectedConditions.visibilityOf(MCepingLoginPage.sms_code)).sendKeys("123456");

    }

    @cucumber.api.java.zh_cn.同时("^点击ceping的申请$")
    public void 点击ceping的申请() throws Throwable {
        wait.until(ExpectedConditions.elementToBeClickable(MCepingLoginPage.submit)).click();
    }

    @cucumber.api.java.zh_cn.那么("^成功进入测评结果页$")
    public void 成功进入测评结果页() throws Throwable {
        // TODO: 2017/11/6 assert
    }
}
