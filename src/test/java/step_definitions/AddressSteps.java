package step_definitions;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.DataHelper;
import modules.VerifyAddressProceed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pageobjects.AddressPage;

import java.util.HashMap;
import java.util.List;

public class AddressSteps {


    public WebDriver driver;
    public List<HashMap<String, String>> datamap;


    public AddressSteps() {
        driver = Hooks.driver;
        datamap = DataHelper.data();
    }

    @When("^I open '(.*)' website$")
    public void iOpenBaiduWebsite(String url) throws Throwable {
        driver.get(url);
    }

    @Then("^I verify address and proceed$")
    public void i_verify_address_and_proceed() throws Throwable {
        PageFactory.initElements(driver, AddressPage.class);
        VerifyAddressProceed.Execute(driver, datamap);

    }


}
