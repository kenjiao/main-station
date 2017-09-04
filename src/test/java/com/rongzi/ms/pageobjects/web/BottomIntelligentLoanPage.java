package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BottomIntelligentLoanPage extends BaseClass {

	public BottomIntelligentLoanPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]//li")
	public static List<WebElement> selects;

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]/form/div[1]/input")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]/form/div[1]/div")
	public static WebElement gender;

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]/form/div[2]/input")
	public static WebElement userMobile;

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]/form/div[3]/input")
	public static WebElement identity;

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]/form/div[4]/input")
	public static WebElement loanMoney;

	@FindBy(how=How.XPATH, using="//section[@class=\"wrapper-freeTaste\"][2]/form/div[5]")
	public static WebElement free;


}
