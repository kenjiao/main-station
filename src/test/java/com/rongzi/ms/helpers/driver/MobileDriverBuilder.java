package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.Env;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.openqa.selenium.Proxy.ProxyType.MANUAL;
import static org.openqa.selenium.remote.CapabilityType.PROXY;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class MobileDriverBuilder extends RemoteDriverBuilder {


    private AppiumServiceBuilder builder;

    public MobileDriverBuilder(DesiredCapabilities capabilities) {
        super(capabilities);
    }

    @Override
    protected void init() {
        builder = new AppiumServiceBuilder().
                withArgument(GeneralServerFlag.LOG_LEVEL, Env.getProperty("appium.log.level", "info")).
                usingAnyFreePort() /*and so on*/;
    }

    public void proxy() {

        // TODO: 2017/10/11 proxy
//        if (Boolean.valueOf(Env.getProperty("proxy.enable", "false"))) {
//            String proxyDetails = String.format("%s:%d", Env.getProperty("proxy.host"), Integer.valueOf(Env.getProperty("proxy.port")));
//            org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
//            proxy.setProxyType(MANUAL);
//            proxy.setHttpProxy(proxyDetails);
//            proxy.setSslProxy(proxyDetails);
//            capabilities.setCapability(PROXY, proxy);
//        }

    }

    public abstract WebDriver getWebDriver();

    public AppiumServiceBuilder getBuilder() {
        return builder;
    }

    public abstract static class MobileDriverMeta extends DriverMeta {

    }
}
