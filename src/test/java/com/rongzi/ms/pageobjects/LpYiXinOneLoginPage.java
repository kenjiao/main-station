package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpYiXinOneLoginPage extends BaseClass {

	public LpYiXinOneLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement telphone;

	@FindBy(how=How.XPATH, using="//*[@id=\"onekeyform\"]/input")
	public static WebElement consult;

	@FindBy(how=How.XPATH, using="//*[@id=\"xubox_layer3\"]/div/div/div[1]/div")
	public static WebElement apply_sucess;


}
