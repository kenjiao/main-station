package com.rongzi.ms.pageobjects.admin;

import com.rongzi.ms.pageobjects.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AdminCustomRequirePage extends BaseClass {

    public AdminCustomRequirePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(how=How.XPATH, using="//*[@id=\"btnSearch\"]")
    public static WebElement search;

    @FindBy(how=How.XPATH, using="//*[@id=\"ApplyUserIdOrCellphone\"]")
    public static WebElement cellphone;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime\"]")
    public static WebElement regist_starttime;

    @FindBy(how=How.XPATH, using="//*[@id=\"applyTime2\"]")
    public static WebElement regist_endtime;

    @FindBy(how=How.XPATH, using="//section[@class=\"sec-data\"]/table[@id=\"tb\"]/tbody")
    public static List<WebElement> data_recordid;

    @FindBy(how=How.XPATH, using="//*[@class=\"call-phone\"]/i")
    public static WebElement call_btn;

    @FindBy(how=How.XPATH, using="//*[@type=\"dialog\"]")
    public static WebElement dialog_box;

    @FindBy(how=How.XPATH, using="//*[@class=\"layui-layer-btn\"]/a[1]")
    public static WebElement dial;

    @FindBy(how=How.XPATH, using="//*[@class=\"btn btn-sm btn-warning e-auditing\"]")
    public static WebElement auditing;

}
