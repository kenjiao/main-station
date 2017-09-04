package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyCodePage extends BaseClass {

	public VerifyCodePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@class=\"member_pop\"]/h2")
	public static WebElement verify_code_title;

	@FindBy(how=How.XPATH, using="//*[@id=\"input-captcha\"]")
	public static WebElement captcha;

	@FindBy(how=How.XPATH, using="//*[@id=\"input-smscode\"]")
	public static WebElement smscode;

	@FindBy(how=How.XPATH, using="//*[@id=\"submit-smscode\"]")
	public static WebElement submit;


}
