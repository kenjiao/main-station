package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FreeExperiencePage extends BaseClass {

	public FreeExperiencePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName2\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile2\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"input-captcha2\"]")
	public static WebElement captcha;

	@FindBy(how=How.XPATH, using="//*[@id=\"input-smscode2\"]")
	public static WebElement smscode;

	@FindBy(how=How.XPATH, using="//*[@id=\"submit-smscode2\"]")
	public static WebElement submit;




}
