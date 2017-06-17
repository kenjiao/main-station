package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HappinessFrogPage extends BaseClass {

	public HappinessFrogPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"account-menu\"]")
	public static WebElement account;

	@FindBy(how=How.XPATH, using="//*[@id=\"login\"]")
	public static WebElement login;

	@FindBy(how=How.XPATH, using="//*[@id=\"logout\"]")
	public static WebElement logout;

	@FindBy(how=How.XPATH, using="//*[@data-translate=\"home.logged.message\"]")
	public static WebElement logged;
}
