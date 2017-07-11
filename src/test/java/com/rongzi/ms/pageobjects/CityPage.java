package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class CityPage extends BaseClass {

	public CityPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="//*[@id=\"hotcitys\"]/li/a")
	public static List<WebElement> cities;


}
