package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class FinancingStrategyPage extends BaseClass {

	public FinancingStrategyPage(WebDriver driver) { super(driver); }

	@FindBy(how=How.XPATH, using="//*[@id=\"userName\"]")
	public static WebElement username;

	@FindBy(how=How.XPATH, using="//*[@id=\"radioman\"]")
	public static WebElement radioman;

	@FindBy(how=How.XPATH, using="//*[@id=\"onekeyform\"]/div[3]")
	public static WebElement identity;

	@FindBy(how=How.XPATH, using="//*[@id=\"onekeyform\"]/div[4]")
	public static WebElement loanmoney;

	@FindBy(how=How.XPATH, using="//*[@id=\"userMobile\"]")
	public static WebElement mobile;

	@FindBy(how=How.XPATH, using="//*[@id=\"btn_zhencerongzi1\"]")
	public static WebElement consignation;




}
