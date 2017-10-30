package com.rongzi.ms.step_definitions.mobile;

import com.rongzi.ms.step_definitions.StepDefs;
import cucumber.api.PendingException;

public class MCepingLoginSteps extends StepDefs{
    @cucumber.api.java.zh_cn.假如("^我在测评着陆页首页\"([^\"]*)\"$")
    public void 我在测评着陆页首页(String MCepingIndex) throws Throwable {
        driver.get(MCepingIndex);

    }

    @cucumber.api.java.zh_cn.并且("^输入ceping的信息$")
    public void 输入ceping的信息() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.同时("^点击ceping的申请$")
    public void 点击ceping的申请() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @cucumber.api.java.zh_cn.那么("^成功进入测评结果页$")
    public void 成功进入测评结果页() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
