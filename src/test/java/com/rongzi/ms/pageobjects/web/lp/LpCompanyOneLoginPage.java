package com.rongzi.ms.pageobjects.web.lp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LpCompanyOneLoginPage extends BaseClass {

	public LpCompanyOneLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"onekeyform\"]/input")
	public static WebElement free_application;

	@FindBy(how=How.XPATH, using="//*[@id=\"qiye1\"]/section[3]/div/input")
	public static WebElement free_application_middle;

	@FindBy(how=How.XPATH, using="//*[@id=\"qiye1\"]/section[4]/div/input")
	public static WebElement free_application_bottom ;



}
