package com.rongzi.ms.step_definitions;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.RecommendLoanProceed;
import com.rongzi.ms.pageobjects.RecommendLoanPage;
import com.rongzi.ms.pageobjects.RecommendLoanPage.ContactInfoPage;
import com.rongzi.ms.pageobjects.RecommendLoanPage.EvaluatePage;
import com.rongzi.ms.pageobjects.RecommendLoanPage.LoanInfoPage;
import com.rongzi.ms.pageobjects.RongziPage;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.rongzi.ms.pageobjects.RongziPage.easyLoan;


/**
 * Created by lining on 2017/7/10.
 */
public class RecommendLoanMoneySteps extends StepDefs {

    @当("^我点击我要申请$")
    public void 我点击我要申请() throws Throwable {

        PageFactory.initElements(driver, RongziPage.class);

        RongziPage.apply.click();
    }

    @那么("^跳转到智能贷，为您精准推荐优质贷款页面$")
    public void 跳转到智能贷为您精准推荐优质贷款页面() throws Throwable {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    @cucumber.api.java.zh_cn.同时("^填写联系方式$")
    public void 填写联系方式() throws Throwable {
        PageFactory.initElements(driver, RecommendLoanPage.class);
        PageFactory.initElements(driver, ContactInfoPage.class);
        PageFactory.initElements(driver, LoanInfoPage.class);
        PageFactory.initElements(driver, EvaluatePage.class);
        RecommendLoanProceed.execute(driver);
    }

    @当("^当我点击智能推荐处的免费体验$")
    public void 当我点击智能推荐处的免费体验() throws Throwable {
        PageFactory.initElements(driver, RongziPage.class);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        easyLoan.click();
    }

    @那么("^成功进入测评页面$")
    public void 成功进入测评页面() throws Throwable {
        if (!Env.getProfile().equals("dev")) {
            driver.manage().addCookie(new Cookie("main_user", "tjM35WAxOR50VOYblRzh6gUy06X1EcetquYMa14YSxUhtKqBRjxZ8Gy0uL30ORHafKgHrT8TNraZFoxdB7mIvlRWL6zxfxMFw4%2b8nqB3xzo%2bGpGr7MGPVtwOIXIFMH7irvJAQAZ28RaNvNYOOfyQ6pjzG5xocA9tX0QF0uW634opb6qJKHSw9KlZAglQWwFU%2f5oOazBZ0FL6m98KruqjwO%2fAaSe%2fju%2bSCz70jR56NqYsvFUCBdelrDB4MtYNEfdhPEr1sm%2fTrHWlxY7X3gGBAIoBJiUoy40rvEpbLceQc5qzD%2bbojUkahFGXwrNeU2G2Nfacndf0utJFS6pRHS05qeYLuBnGJN%2fQTzJfNFOpjoGJJmP097B5I1qKsJMiezSjb74v6B2x64veLSzKqCOhOGDBO2vIjQMHe1TSnMbXtOJNKRLtw5RAveCaIRPzXru0zQ0jg8HLQB7coL6B3sU9p5ietU2e7Oc%2bNwUwGh3qHIWMTt%2boJjp7I3ID%2bNI%2btIVPbUCqT4iYGG3ebSwWpA3FdTkW9M62BenK2d%2bw8Uc%2bLyzQQHtzyJmfsER32lJudJcrDrCsegpYcwN9u%2fbYn55D8cE3RjImttPTl6gYlRUerW21mBWxx6Rf7CL9%2bICFArHCGpjBDjim5V4Ql793rTPAGkggpDPjXsy71EdukFZ9gtO3jfeH6JmfoEBZb3akHLQNHw%2fTqMgwn0qjmf%2bO9VLXqnsHLLOEwqulfj9NUqPD4Ly40P6%2bIgAQr24qTbsZQYuZORVou6PQv6Xgm0Ip5Eyy0%2fspa2dDP%2fbmjZSpM9lnOCzX29EbzIvma%2f5cxnQqd3eqQakxDCw3DCAU%2fVRdTaA0qfZf43BqWzPP0z2iwXDRd4Zku07Z0jFz1yGNFcgBJimM91vb4Wc%2bRCrY%2fCvDjFTfJQkF0MMrqo%2fL3MxhnZ0Dfvf5p0viL2gYRsJ7I7XSq%2b7xHSlW56uo95wHTHgmW7krOdw0WsXCOsIqqGXOtA94JKU%3d", "/"));
            driver.get(Env.getProperty("rongzi.index") + "/quicktest/step2");
        }
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(driver -> driver.getCurrentUrl().contains("quicktest/step2"));

    }

    @并且("^点击快速选款$")
    public void 点击快速选款() throws Throwable {

        LoanInfoPage.loanAmount.sendKeys("2");
        LoanInfoPage.loanPeriod.sendKeys("2");
        LoanInfoPage.identity.click();
        LoanInfoPage.incomeDistributionType.click();
        LoanInfoPage.incomeDistributionTypes.get(0).click();
        LoanInfoPage.salary.sendKeys("20000");
        LoanInfoPage.socialSecurityFund.click();
        LoanInfoPage.socialSecurityFunds.get(0).click();
        LoanInfoPage.age.sendKeys("27");
        LoanInfoPage.quickLoan.click();
    }

    @那么("^成功进入到测评结果页$")
    public void 成功进入到测评结果页() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(driver -> driver.getCurrentUrl().contains("quicktest/step3"));
        PageFactory.initElements(driver, EvaluatePage.class);
        Assert.assertTrue(driver.getCurrentUrl().contains("quicktest/step3"));
    }
}
