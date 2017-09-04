package com.rongzi.ms.step_definitions.web;

import com.rongzi.ms.domain.UserLoanInfo;
import com.rongzi.ms.modules.IntelligentLoanProceed;
import com.rongzi.ms.pageobjects.web.BottomIntelligentLoanPage;
import com.rongzi.ms.pageobjects.web.CenterIntelligentLoanPage;
import com.rongzi.ms.pageobjects.web.RightIntelligentLoanPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by lining on 2017/7/5.
 */
public class IntelligentLoanSteps extends StepDefs {


    @当("^填写右部智能贷款个人信息$")
    public void 填写右部智能贷款个人信息(List<UserLoanInfo> userLoanInfos) throws Throwable {
        PageFactory.initElements(driver, RightIntelligentLoanPage.class);

        for (UserLoanInfo userLoanInfo : userLoanInfos) {
            IntelligentLoanProceed.executeRightLoan(driver, userLoanInfo);
        }

    }

    @并且("^点击右部免费智能贷款$")
    public void 点击右部免费智能贷款() throws Throwable {
        RightIntelligentLoanPage.free.click();
    }


    @当("^填写中部智能贷款个人信息$")
    public void 填写中部智能贷款个人信息(List<UserLoanInfo> userLoanInfos) throws Throwable {
        PageFactory.initElements(driver, CenterIntelligentLoanPage.class);
        for (UserLoanInfo userLoanInfo : userLoanInfos) {
            IntelligentLoanProceed.executeCenterLoan(driver, userLoanInfo);
        }

    }

    @并且("^点击中部免费智能贷款$")
    public void 点击中部免费智能贷款() throws Throwable {
        CenterIntelligentLoanPage.free.click();
    }

    @当("^填写底部智能贷款个人信息$")
    public void 填写底部智能贷款个人信息(List<UserLoanInfo> userLoanInfos) throws Throwable {
        PageFactory.initElements(driver, BottomIntelligentLoanPage.class);

        for (UserLoanInfo userLoanInfo : userLoanInfos) {
            IntelligentLoanProceed.executeBottomLoan(driver, userLoanInfo);
        }
    }

    @并且("^点击底部免费智能贷款$")
    public void 点击底部免费智能贷款() throws Throwable {
        BottomIntelligentLoanPage.free.click();
    }


}


