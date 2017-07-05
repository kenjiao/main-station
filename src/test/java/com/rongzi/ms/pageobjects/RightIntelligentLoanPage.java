package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class RightIntelligentLoanPage extends BaseClass {

	public RightIntelligentLoanPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@name=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.CSS, using=".banner-content-right-infor .dropdown li")
	public static List<WebElement> selects;

	@FindBy(how=How.CSS, using=".genderBox")
	public static WebElement gender;

	@FindBy(how=How.XPATH, using="//*[@name=\"userIdentity\"]")
	public static WebElement identity;

	@FindBy(how=How.XPATH, using="//*[@name=\"loanMoney\"]")
	public static WebElement loanMoney;

	@FindBy(how=How.XPATH, using="//*[@name=\"userMobile\"]")
	public static WebElement userMobile;

	@FindBy(how=How.CSS, using=".searchBtn")
	public static WebElement search_money;


}
