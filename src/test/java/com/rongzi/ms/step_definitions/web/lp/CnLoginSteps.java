package com.rongzi.ms.step_definitions.web.lp;

import com.rongzi.ms.pageobjects.web.CnLoginPage;
import com.rongzi.ms.pageobjects.web.DialogCityPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Administrator on 2018/1/4 0004.
 */
public class CnLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在\"([^\"]*)\"$")
    public void 我在(String CnIndex) throws Throwable {
        driver.get(CnIndex);
    }


    @cucumber.api.java.zh_cn.同时("^选择贷款城市上海$")
    public void 选择贷款城市上海() throws Throwable {
        PageFactory.initElements(driver,DialogCityPage.class);
        DialogCityPage.shanghai.click();
    }
    @cucumber.api.java.zh_cn.并且("^输入免费咨询申请信息$")
    public void 输入免费咨询申请信息() throws Throwable {
        PageFactory.initElements(driver,CnLoginPage.class);
        CnLoginPage.username.sendKeys("li");
        CnLoginPage.mobile.sendKeys("18321950423");
        CnLoginPage.immediate_consultation.click();
    }


}
