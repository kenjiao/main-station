package com.rongzi.ms.step_definitions;

import com.rongzi.ms.modules.RongziAddressProceed;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.那么;

/**
 * Created by lining on 2017/6/28.
 */
public class RongziSteps extends StepDefs {

    @假如("^我在主站首页$")
    public void 我在主站首页() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.rongzi.com");
    }


    @那么("^主站首页的主题是\"([^\"]*)\"$")
    public void 主站首页的主题是(String title) throws Throwable {
        RongziAddressProceed.execute(driver,title);
    }


}
