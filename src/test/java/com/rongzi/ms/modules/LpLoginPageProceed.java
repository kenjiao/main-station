package com.rongzi.ms.modules;

import com.rongzi.ms.helpers.Env;
import org.openqa.selenium.WebDriver;

/**
 * Created by lining on 2017/9/4.
 */
public class LpLoginPageProceed {

    public static void open(WebDriver driver, String index) {
        driver.get(Env.getProperty("rongzi.index") + index);
    }
}
