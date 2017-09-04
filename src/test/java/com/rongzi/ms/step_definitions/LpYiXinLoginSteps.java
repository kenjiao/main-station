package com.rongzi.ms.step_definitions;

import com.gargoylesoftware.htmlunit.Page;
import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.pageobjects.LpYiXinLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/8/1 0001.
 */
public class LpYiXinLoginSteps extends StepDefs{

    @假如("^我在宜信着陆页首页\"([^\"]*)\"$")
    public void 我在宜信着陆页首页(String lpYiXinIndex) throws Throwable {
        LpLoginPageProceed.open(driver, lpYiXinIndex);
        PageFactory.initElements(driver, LpYiXinLoginPage.class);
    }

    @并且("^输入宜信着陆页用户信息$")
    public void 输入宜信着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver,LpYiXinLoginPage.class);
        LpYiXinLoginPage.username.sendKeys("li");
        LpYiXinLoginPage.telphone.sendKeys("18321950423");
    }

    @同时("^点击宜信着陆页立即申请$")
    public void 点击宜信着陆页立即申请() throws Throwable {
        LpYiXinLoginPage.consult.click();
    }
}
