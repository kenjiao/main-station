package com.rongzi.ms.pageobjects.web;

/**
 * Created by Administrator on 2017/12/29 0029.
 */

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * “公司简介”页面
 */
public class AboutUsPage extends BaseClass {

    public AboutUsPage(WebDriver driver)
    {
        super(driver);
    }

    //  "公司简介"

    @FindBy(how= How.XPATH, using="//*[@id=\"aboutUs_\"]")
    public static WebElement brief_introduction;





}
