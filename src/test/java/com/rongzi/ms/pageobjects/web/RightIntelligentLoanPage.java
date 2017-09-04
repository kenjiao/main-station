package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
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

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form li")
	public static List<WebElement> selects;

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form > div.inforBox.nameBox > input")
	public static WebElement username;

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form > div.inforBox.nameBox > div")
	public static WebElement gender;

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form > div:nth-child(2) > input")
	public static WebElement identity;

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form > div:nth-child(3) > input")
	public static WebElement loanMoney;

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form > div:nth-child(4) > input")
	public static WebElement userMobile;

	@FindBy(how=How.CSS, using=".banner-content-right-infor > form > input")
	public static WebElement free;


}
