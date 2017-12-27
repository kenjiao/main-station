package com.rongzi.ms.pageobjects.web.lp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

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
	public static WebElement free_middle_application;

	@FindBy(how=How.XPATH, using="//*[@id=\"qiye1\"]/section[4]/div/input")
	public static WebElement free_bottom_application ;

	public static class NextPage {



		@FindBy(how=How.XPATH, using="//*[@id=\"userName2\"]")
		public static WebElement username;

		@FindBy(how=How.XPATH, using="//*[@id=\"userMobile2\"]")
		public static WebElement mobile;

		@FindBy(how=How.XPATH, using="//*[@id=\"input-captcha2\"]")
		public static WebElement verification_code;

		@FindBy(how=How.XPATH, using="//*[@id=\"input-smscode2\"]")
		public static WebElement sms_code;

		@FindBy(how=How.XPATH, using="//*[@id=\"submit-smscode2\"]")
		public static WebElement next;







	}




}
