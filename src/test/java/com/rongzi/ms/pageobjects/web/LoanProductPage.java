package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoanProductPage extends BaseClass {

	public LoanProductPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="/html/body/section[1]/div/div[2]/div[2]/form/div[1]/input")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="/html/body/section[4]/form/div[2]/input")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="/html/body/section[4]/form/div[5]")
	public static WebElement free_experience;

	@FindBy(how=How.XPATH, using="//html/body/section[3]/div[2]/div[1]/div[2]/div[2]/p[1]/a")
	public static WebElement product_details;





}
