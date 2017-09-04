package com.rongzi.ms.modules;

import org.openqa.selenium.WebDriver;

/**
 * Created by lining on 2017/9/4.
 */
public class LpLoginPageProceed {


    public static void open(WebDriver driver, String index, String suffix) {
        driver.get(index + suffix);
    }
}
