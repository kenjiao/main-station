package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpJingJianLoginPage extends BaseClass {

	public LpJingJianLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"btn_submit\"]")
	public static WebElement consult;

	@FindBy(how=How.XPATH, using="//*[@id=\"caseShowBanner\"]/ul/li[1]/a")
	public static WebElement application;


}
