package com.rongzi.ms.step_definitions;

import com.rongzi.ms.modules.HappinessFrogAddressProceed;
import com.rongzi.ms.modules.LoginAction;
import com.rongzi.ms.modules.LogoutAction;
import com.rongzi.ms.pageobjects.HappinessFrogPage;
import com.rongzi.ms.pageobjects.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuan on 2017/6/17.
 */
public class HappinessFrogSteps {

    public WebDriver driver;


    public HappinessFrogSteps() {

        driver = Hooks.driver;

    }

    @Given("^I am on the Happiness Frog page$")
    public void I_am_on_the_Happiness_Frog_page() {
        driver.get("http://www.happiness-frog.cn");

    }

    @Then("^the page title should start with \"([^\"]*)\"$")
    public void the_page_title_should_start_with(String title) {
        HappinessFrogAddressProceed.Execute(driver, title);
    }

    @And("^I sign in$")
    public void iSignIn() throws Throwable {
        PageFactory.initElements(driver, HappinessFrogPage.class);
        PageFactory.initElements(driver, LoginPage.class);
        LoginAction.execute(driver, "admin", "admin");
    }

    @Then("^I sign out$")
    public void iSignOut() throws Throwable {
        LogoutAction.execute(driver);
    }
}
