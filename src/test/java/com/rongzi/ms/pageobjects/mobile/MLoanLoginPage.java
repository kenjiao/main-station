package com.rongzi.ms.pageobjects.mobile;

import com.rongzi.ms.pageobjects.BaseClass;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

public class MLoanLoginPage extends BaseClass {

    public MLoanLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"userName\"]")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    public static WebElement username;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cellPhoneNumber\"]")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    public static WebElement mobile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"oneKeyBtnSubmit\"]")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    public static WebElement submit;

    @FindBy(how = How.XPATH, using = "//*[@id=\"inputImgCode\"]")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    public static WebElement imgCode;

    @FindBy(how = How.XPATH, using = "//*[@id=\"inputSmsCode\"]")
    @WithTimeout(time = 5, unit = TimeUnit.SECONDS)
    public static WebElement smsCode;


}
