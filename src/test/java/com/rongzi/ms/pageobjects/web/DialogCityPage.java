package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DialogCityPage extends BaseClass {

	public DialogCityPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(how=How.XPATH, using="/html/body/section/div/ul[2]/li[2]/dl/dd/a[1]")
	public static WebElement shanghai;
}
