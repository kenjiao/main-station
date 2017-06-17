package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@data-translate=\"login.title\"]")
	public static WebElement login_title;

	@FindBy(how=How.XPATH, using="//*[@id=\"username\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"password\"]")
	public static WebElement password;

	@FindBy(how=How.XPATH, using="//*[@data-translate=\"login.form.button\"]")
	public static WebElement login;

}
