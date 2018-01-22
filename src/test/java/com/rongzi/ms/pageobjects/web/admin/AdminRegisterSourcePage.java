package com.rongzi.ms.pageobjects.web.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminRegisterSourcePage extends BaseClass {

    public AdminRegisterSourcePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-selection__arrow\"]")
    public static WebElement register_platform_btn;

    @FindBy(how=How.XPATH, using="//*[@class=\"select2-results__options\"]/li")
    public static List<WebElement> register_platform;

    @FindBy(how=How.XPATH, using="//*[@id=\"form_search_condition\"]/ul/li[3]/input")
    public static WebElement page_size;

    @FindBy(how=How.XPATH, using="//*[@id=\"form_search_condition\"]/ul/li[4]/button")
    public static WebElement search;

}
