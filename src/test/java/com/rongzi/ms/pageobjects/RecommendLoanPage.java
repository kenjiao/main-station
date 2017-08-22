package com.rongzi.ms.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Yuan on 2017/7/11.
 */
public class RecommendLoanPage extends BaseClass {

    public RecommendLoanPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"step_head\"]/div")
    public static WebElement head_bar;


    public static class ContactInfoPage extends BaseClass {

        public ContactInfoPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"realname\"]")
        public static WebElement realname;

        @FindBy(how = How.XPATH, using = "//*[@id=\"uniform-radioman2\"]")
        public static WebElement gender;

        @FindBy(how = How.XPATH, using = "//*[@id=\"telephone\"]")
        public static WebElement telephone;

        @FindBy(how = How.XPATH, using = "//*[@id=\"imgVerCode\"]")
        public static WebElement imgVerCode;

        @FindBy(how = How.XPATH, using = "//*[@id=\"VeriCode\"]")
        public static WebElement verCode;

        @FindBy(how = How.XPATH, using = "//footer/a")
        public static WebElement next;

    }

    public static class LoanInfoPage extends BaseClass {

        public LoanInfoPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(how = How.XPATH, using = "//*[@id=\"LoanAmount\"]")
        public static WebElement loanAmount;

        @FindBy(how = How.XPATH, using = "//*[@id=\"LoanPerod\"]")
        public static WebElement loanPeriod;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_UseLoanProvince\"]")
        public static WebElement loanProvince;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_UseLoanCity\"]")
        public static WebElement loanCity;


        @FindBy(how = How.XPATH, using = "//*[@id=\"rd_identity_4\"]")
        public static WebElement identity;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_IncomeDistributionType\"]")
        public static WebElement incomeDistributionType;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_WorkingAge\"]")
        public static WebElement workingAge;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_SocialSecurityFund\"]")
        public static WebElement socialSecurityFund;


        @FindBy(how = How.XPATH, using = "//*[@id=\"Age\"]")
        public static WebElement age;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_CreditStanding\"]")
        public static WebElement creditStanding;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_HaveHouse\"]")
        public static WebElement haveHouse;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_HaveCar\"]")
        public static WebElement haveCar;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_InsuranceInfo\"]")
        public static WebElement insuranceInfo;


        @FindBy(how = How.XPATH, using = "//*[@id=\"h4_More\"]/i")
        public static WebElement more;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_CensusRegisterSeatProvince\"]")
        public static WebElement censusRegisterProvince;
        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_WorkingProvince\"]")

        public static WebElement workingProvince;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_CompanyType\"]")
        public static WebElement cmpanyType;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_IsFormalEstablishment\"]")
        public static WebElement isFormalEstablishment;

        @FindBy(how = How.XPATH, using = "//*[@id=\"txt_CreditCardAmount\"]")
        public static WebElement creditCardAmount;

        @FindBy(how = How.XPATH, using = "//*[@id=\"d16-Step3\"]/div/div[3]/a")
        public static WebElement quickLoan;

    }

    public static class EvaluatePage extends BaseClass {

        public EvaluatePage(WebDriver driver) {
            super(driver);
        }


    }

}
