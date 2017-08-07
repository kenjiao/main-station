package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RongziLoginPage extends BaseClass {

	public RongziLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"telephone\"]")
	public static WebElement telephone;

	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")
	public static WebElement password;

	@FindBy(how=How.XPATH, using="//*[@id=\"verCode\"]")
	public static WebElement verCode;

	@FindBy(how=How.XPATH, using="//*[@id=\"loginSub1\"]")
	public static WebElement login;




}
