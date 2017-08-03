package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpCompletelyLoginPage extends BaseClass {

	public LpCompletelyLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement telphone;

	@FindBy(how=How.XPATH, using="/html/body/section[2]/div[1]/div/div[2]/form/input")
	public static WebElement consult;

	@FindBy(how=How.XPATH, using="/html/body/section[6]/form/div[1]/input")
	public static WebElement username3;

	@FindBy(how=How.XPATH, using="/html/body/section[6]/form/div[3]/input")
	public static WebElement mobile3;

	@FindBy(how=How.XPATH, using="/html/body/section[6]/form/div[5]")
	public static WebElement free_experience;

	@FindBy(how=How.XPATH, using="//*[@id=\"caseShowBanner\"]/ul/li[1]/a")
	public static WebElement free_experience1;






}
