package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RongziBlueLoginPage extends BaseClass {

	public RongziBlueLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@name=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@name=\"userIdentity\"]")
	public static WebElement userIdentity;

	@FindBy(how=How.CSS, using=".dropdown")
	public static WebElement identitySelects;

	@FindBy(how=How.CSS, using=".genderBox")
	public static WebElement gender;

	@FindBy(how=How.XPATH, using="//*[@name=\"loanMoney\"]")
	public static WebElement loanMoney;

	@FindBy(how=How.CSS, using=".dropdown .money")
	public static WebElement loanMoneySelects;

	@FindBy(how=How.XPATH, using="//*[@name=\"userMobile\"]")
	public static WebElement userMobile;

	@FindBy(how=How.CLASS_NAME, using="searchBtn freeBtn")
	public static WebElement search_money;










}
