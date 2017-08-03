package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpOnePageLoginPage extends BaseClass {

	public LpOnePageLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement telphone;

	@FindBy(how=How.XPATH, using="//*[@id=\"onekeyform\"]/input")
	public static WebElement consult;

	@FindBy(how=How.XPATH, using="/html/body/section[1]/ul/li[4]/a/img")
	public static WebElement free_consultation;

	@FindBy(how=How.XPATH, using="//*[@id=\"cn_userName2\"]")
	public static WebElement cusername2;

	@FindBy(how=How.XPATH, using="//*[@id=\"Identity_txt2\"]")
	public static WebElement identity;

	@FindBy(how=How.XPATH, using="//*[@id=\"cn_loanMoney_02\"]")
	public static WebElement loan_money;

	@FindBy(how=How.XPATH, using="//*[@id=\"cn_userMobile2\"]")
	public static WebElement mobile2;

	@FindBy(how=How.XPATH, using="//*[@id=\"xubox_layer5\"]/div[1]/div[1]/div/div/ul/li[12]/input")
	public static WebElement submit;






}
