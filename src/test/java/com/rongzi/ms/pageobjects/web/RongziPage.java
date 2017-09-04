package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RongziPage extends BaseClass {

	public RongziPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"ul_login\"]/li[2]/a")
	public static WebElement login_please;


	@FindBy(how=How.XPATH, using="//*[@id=\"caseShowBanner\"]/ul/li[1]/a")
	public static WebElement apply;


	@FindBy(how=How.XPATH, using="//a[@href=\"/quicktest/step1\"][1]")
	public static WebElement easyLoan;


	@FindBy(how=How.XPATH, using="//a[@href=\"http://gl.rongzi.com/\"]")
	public static WebElement strategy;

	@FindBy(how=How.XPATH, using="//a[@href=\"http://shanghai.rongzi.com/product/\"]")
	public static WebElement loan_product;



}
