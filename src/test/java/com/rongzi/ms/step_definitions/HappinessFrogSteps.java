package com.rongzi.ms.step_definitions;

import com.rongzi.ms.modules.HappinessFrogAddressProceed;
import com.rongzi.ms.modules.LoginAction;
import com.rongzi.ms.modules.LogoutAction;
import com.rongzi.ms.pageobjects.HappinessFrogPage;
import com.rongzi.ms.pageobjects.LoginPage;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yuan on 2017/6/18.
 */
public class HappinessFrogSteps extends StepDefs {

    @假如("^我在首页$")
    public void 我在首页() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.happiness-frog.cn");
    }

    @那么("^首页的主题是\"([^\"]*)\"$")
    public void 首页的主题是(String title) throws Throwable {
        HappinessFrogAddressProceed.Execute(driver, title);
    }

    @并且("^我要登陆$")
    public void 我要登陆() throws Throwable {
        PageFactory.initElements(driver, HappinessFrogPage.class);
        PageFactory.initElements(driver, LoginPage.class);
        LoginAction.execute(driver, "user", "user");
    }

    @那么("^我还可以登出$")
    public void 我还可以登出() throws Throwable {
        LogoutAction.execute(driver);
    }
}
