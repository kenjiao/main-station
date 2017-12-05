package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.lp.LpCompanyOneLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/12/5 0005.
 */
public class LpCompanyOneLoginSteps extends StepDefs{

    @cucumber.api.java.zh_cn.并且("^输入企业one着陆页用户信息$")
    public void 输入企业one着陆页用户信息() throws Throwable {
        PageFactory.initElements(driver, LpCompanyOneLoginPage.class);
        LpCompanyOneLoginPage.username.sendKeys("li");
        LpCompanyOneLoginPage.mobile.sendKeys("18321950423");
    }

    @cucumber.api.java.zh_cn.同时("^点击企业one着陆页立即免费申请$")
    public void 点击企业one着陆页立即免费申请() throws Throwable {
        LpCompanyOneLoginPage.free_application.click();
    }
}
