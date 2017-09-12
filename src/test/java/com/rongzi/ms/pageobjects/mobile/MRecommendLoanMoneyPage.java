package com.rongzi.ms.pageobjects.mobile;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MRecommendLoanMoneyPage extends BaseClass {

	public MRecommendLoanMoneyPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"LoanAmount_scroll\"]/div/div[2]/div[2]/input")
	public static WebElement loan_amount;

	@FindBy(how = How.XPATH, using = "//*[@id=\"LoanPerod_scroll\"]/div/div[2]/div[2]/input")
	public static WebElement loan_period;

	@FindBy(how = How.XPATH, using = "//*[@id=\"WorkingCity_scroll\"]/div[2]/div[2]")
	public static WebElement working_city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"SHANGHAI\"]")
	public static WebElement city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"WorkingAge_scroll\"]/div[2]/div[2]")
	public static WebElement working_age;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/ul/li[3]")
	public static WebElement one_year;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CensusRegisterSeatCity_scroll\"]/div[2]/div[2]")
	public static WebElement register_city;

	@FindBy(how = How.XPATH, using = "//*[@id=\"CreditStanding_scroll\"]/div[2]/div[2]")
	public static WebElement credit_standing;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div/div/div/div/ul/li[1]")
	public static WebElement credit_unknown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"UseLoanCity_scroll\"]/div[2]")
	public static WebElement loan_city;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div[2]/ng-view/section/div/div[3]/div/div[2]")
	public static WebElement submit;

	}







