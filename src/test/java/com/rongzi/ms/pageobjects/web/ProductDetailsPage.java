package com.rongzi.ms.pageobjects.web;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ProductDetailsPage extends BaseClass {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "body > section.wrapper-detail > div > div.detail-right.f-fr > div.right-formLoan > form > div.inforBox.nameBox > input")
    public static WebElement username;

    @FindBy(how = How.CSS, using = ".right-formLoan > form > div:nth-child(4) > input")
    public static WebElement mobile;

    @FindBy(how = How.XPATH, using = "//*[@value=\"智能找贷款\"]")
    public static WebElement intelligent_loan;

}
