package com.rongzi.ms.pageobjects.web.lp;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

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


	public static class LoanPage {


		@FindBy(how=How.CLASS_NAME, using="tittle_word")
		public static WebElement title;

		@FindBy(how=How.XPATH, using="//*[@id=\"cn_userName2\"]")
		public static WebElement username;

		@FindBy(how=How.XPATH, using="//*[@id=\"Identity_txt2\"]")
		public static WebElement identity;

		@FindBy(how=How.XPATH, using="//*[@id=\"dropdown_Identity2\"]/li")
		public static List<WebElement> identitySelects;

		@FindBy(how=How.XPATH, using="//*[@id=\"cn_loanMoney_02\"]")
		public static WebElement loanMoney;

		@FindBy(how=How.XPATH, using="//*[@id=\"cn_dropdown_money_02\"]/li[1]")
		public static List<WebElement> loanMoneySelects;

		@FindBy(how=How.XPATH, using="//*[@id=\"cn_userMobile2\"]")
		public static WebElement mobile;

		@FindBy(how=How.XPATH, using="//*[@id=\"cn_imgcode2\"]")
		public static WebElement imgCode;

		@FindBy(how=How.XPATH, using="//*[@id=\"cn_ucode2\"]")
		public static WebElement smsCode;

		@FindBy(how=How.XPATH, using="//*[@id=\"xubox_layer5\"]/div[1]/div[1]/div/div/ul/li[12]/input")
		public static WebElement submit;

		@FindBy(how=How.XPATH, using="//*[@id=\"xubox_layer3\"]/div/div/div[1]/div")
		public static WebElement apply_sucess;




	}



}
