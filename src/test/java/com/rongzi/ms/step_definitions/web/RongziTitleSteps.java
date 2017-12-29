package com.rongzi.ms.step_definitions.web;

import com.rongzi.ms.pageobjects.web.AboutUsPage;
import com.rongzi.ms.pageobjects.web.RongziPage;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by Administrator on 2017/12/29 0029.
 */
public class RongziTitleSteps extends StepDefs {
    {

    }

    @当("^点击底部关于我们$")
    public void 点击底部关于我们() throws Throwable {

        PageFactory.initElements(driver, RongziPage.class);
        RongziPage.about_us.click();
    }

    @那么("^进入成功进入到公司简介页面$")
    public void 进入成功进入到公司简介页面() throws Throwable {
        //进行http://www.rongzi.com/helpcenter/aboutus 的URL 比对

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(AboutUsPage.brief_introduction));

        PageFactory.initElements(driver, AboutUsPage.class);  //此操作相当于java中的ski

        //判断进入“关于我们”界面，此元素是否存在
        Assert.assertTrue(AboutUsPage.brief_introduction.isDisplayed());

    }
}
