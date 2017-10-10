package com.rongzi.ms.modules;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

/**
 * Created by lining on 2017/9/4.
 */
public class MLoginPageProceed {

    public static void open(WebDriver driver, String index, String suffix) {
        driver.get(StringUtils.replace(index, "www", "m") + suffix);
    }
}
