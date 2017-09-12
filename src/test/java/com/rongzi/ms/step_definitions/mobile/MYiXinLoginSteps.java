package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.pageobjects.mobile.MYiXinLoginPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2017/9/12 0012.
 */
public class MYiXinLoginSteps extends StepDefs{

    @假如("^我在YiXin着陆页$")
    public void 我在yixin着陆页() throws Throwable {
        String index = StringUtils.replace(Env.getProperty("rongzi.index"), "www", "m");
        LpLoginPageProceed.open(driver, index, "/lp/yixin");
    }

    @并且("^输入立即借款的信息$")
    public void 输入立即借款的信息() throws Throwable {
        PageFactory.initElements(driver,MYiXinLoginPage.class);
        MYiXinLoginPage.limit.click();
        MYiXinLoginPage.money.click();
        MYiXinLoginPage.current_city.click();
        MYiXinLoginPage.city.click();
        MYiXinLoginPage.username.sendKeys("li");
        MYiXinLoginPage.mobile.sendKeys("18321950423");
        MYiXinLoginPage.imgCode.sendKeys("1234");
        MYiXinLoginPage.smsCode.sendKeys("123456");

    }

    @同时("^点击立即借款$")
    public void 点击立即借款() throws Throwable {
        MYiXinLoginPage.submit.click();
    }
}
