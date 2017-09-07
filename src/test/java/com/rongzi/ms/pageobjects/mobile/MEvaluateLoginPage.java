package com.rongzi.ms.pageobjects.mobile;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MEvaluateLoginPage extends BaseClass {

	public MEvaluateLoginPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"userNeedMoney\"]")
	public static WebElement loan_money;

	@FindBy(how=How.XPATH, using="//*[@id=\"modelli10\"]")
	public static WebElement money;

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"cellPhoneNumber\"]")
	public static WebElement cell_Phone;

	@FindBy(how=How.XPATH, using="//*[@id=\"oneKeyBtnSubmit\"]")
	public static WebElement submit;

	@FindBy(how=How.XPATH, using="//*[@id=\"inputImgCode\"]")
	public static WebElement imgCode;

	@FindBy(how=How.XPATH, using="//*[@id=\"inputSmsCode\"]")
	public static WebElement SmsCode;


}
