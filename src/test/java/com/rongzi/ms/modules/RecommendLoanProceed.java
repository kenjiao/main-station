package com.rongzi.ms.modules;

import com.rongzi.ms.pageobjects.web.RecommendLoanPage;
import com.rongzi.ms.pageobjects.web.RecommendLoanPage.ContactInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecommendLoanProceed {


    public static void execute(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(RecommendLoanPage.head_bar));

        ContactInfoPage.realname.sendKeys("lining");

        ContactInfoPage.telephone.sendKeys("18321950423");

        wait.until(ExpectedConditions.visibilityOf(ContactInfoPage.imgVerCode)).sendKeys("1111");

        ContactInfoPage.verCode.sendKeys("111111");

        ContactInfoPage.next.click();

    }

}
