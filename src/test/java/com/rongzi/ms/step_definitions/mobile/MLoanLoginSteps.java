package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.helpers.Env;
import com.rongzi.ms.modules.LpLoginPageProceed;
import com.rongzi.ms.modules.RongziAddressProceed;
import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.同时;
import cucumber.api.java.zh_cn.并且;
import cucumber.api.java.zh_cn.那么;

import java.net.URL;

public class MLoanLoginSteps extends StepDefs {

    @假如("^我在\"([^\"]*)\"着陆页$")
    public void 我在着陆页(String suffix) throws Throwable {
        String index = Env.getProperty("rongzi.index");
        URL url = new URL(index);
        URL mobileUrl = new URL(url.getProtocol(), "m." + url.getHost(), url.getPort(), url.getFile());
        RongziAddressProceed.open(driver, mobileUrl.toString(), Env.getProperty("rongzi.city", "上海市"));

        LpLoginPageProceed.open(driver, mobileUrl.toString(), suffix);

        throw new PendingException();
    }

    @并且("^输入贷款信息$")
    public void 输入贷款信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @同时("^点击马上申请$")
    public void 点击马上申请() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @那么("^成功进入M站测评页面$")
    public void 成功进入m站测评页面() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
