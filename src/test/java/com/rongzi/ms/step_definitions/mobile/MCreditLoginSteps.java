package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MCreditLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.support.PageFactory;

public class MCreditLoginSteps extends StepDefs{

    @假如("^我在信用着陆页$")
    public void 我在信用着陆页() throws Throwable {
        String index = StringUtils.replace(Env.getProperty("rongzi.index"), "www", "m");
        LpLoginPageProceed.open(driver, index, "/lp/xinyong");
    }

    @并且("^输入信用信息$")
    public void 输入信用信息() throws Throwable {
        PageFactory.initElements(driver,MCreditLoginPage.class);
        MCreditLoginPage.city.click();
        MCreditLoginPage.shanghai.click();
        MCreditLoginPage.username.sendKeys("li");
        MCreditLoginPage.mobile.sendKeys("18321950423");
        MCreditLoginPage.smsCode.sendKeys("123456");


    }

    @同时("^点击免费申请贷款$")
    public void 点击免费申请贷款() throws Throwable {
        MCreditLoginPage.submit.click();
    }


}
