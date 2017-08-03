package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpLoanLoginPage extends BaseClass {

	public LpLoanLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement telphone;

	@FindBy(how=How.XPATH, using="//*[@id=\"btn_submit\"]")
	public static WebElement consult;

	@FindBy(how=How.XPATH, using="/html/body/section[4]/div[1]/div/p[2]/a")
	public static WebElement immediately_loan;

	@FindBy(how=How.XPATH, using="//*[@id=\"userName2\"]")
	public static WebElement username2;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile2\"]")
	public static WebElement mobile2;

	@FindBy(how=How.XPATH, using="//*[@id=\"House_txt2\"]")
	public static WebElement house;

	@FindBy(how=How.XPATH, using="//*[@id=\"Car_txt2\"]")
	public static WebElement car;

	@FindBy(how=How.XPATH, using="//*[@id=\"Salary_txt2\"]")
	public static WebElement salary;

	@FindBy(how=How.XPATH, using="//*[@id=\"Credit_txt2\"]")
	public static WebElement credit;

	@FindBy(how=How.XPATH, using="//*[@id=\"btn_submitOneClickApply3\"]")
	public static WebElement consult2;






}
