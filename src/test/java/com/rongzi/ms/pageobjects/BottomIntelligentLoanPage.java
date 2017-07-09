package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BottomIntelligentLoanPage extends BaseClass {

	public BottomIntelligentLoanPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.CSS, using="body > section:nth-child(19) li")
	public static List<WebElement> selects;

	@FindBy(how=How.CSS, using="body > section:nth-child(19) > form > div.inforBox.nameBox > input")
	public static WebElement username;

	@FindBy(how=How.CSS, using="body > section:nth-child(19) > form > div.inforBox.nameBox > div")
	public static WebElement gender;

	@FindBy(how=How.CSS, using="body > section:nth-child(19) > form > div.inforBox.inforBoxIdentify > input")
	public static WebElement identity;

	@FindBy(how=How.CSS, using="body > section:nth-child(19) > form > div:nth-child(4) > input")
	public static WebElement loanMoney;

	@FindBy(how=How.CSS, using="body > section:nth-child(19) > form > div:nth-child(2) > input")
	public static WebElement userMobile;

	@FindBy(how=How.CSS, using="body > section:nth-child(19) > form > div.freeBtn")
	public static WebElement free;


}
