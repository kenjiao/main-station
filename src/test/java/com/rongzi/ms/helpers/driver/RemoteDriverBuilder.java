package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.Env;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.Proxy.ProxyType.MANUAL;
import static org.openqa.selenium.remote.CapabilityType.PROXY;

/**
 * Created by lining on 2017/9/8.
 */
public abstract class RemoteDriverBuilder implements DriverBuilder, Proxy {

    private DesiredCapabilities capabilities;

    public RemoteDriverBuilder(DesiredCapabilities capabilities) {
        this.capabilities = capabilities;
    }


    @Override
    public WebDriver build() {
        if (Boolean.valueOf(Env.getProperty("proxy.enable", "false"))) {
            proxy();
        }
        String hub = Env.getProperty("remote.hub");

        if (!StringUtils.isEmpty(hub)) {

            try {
                return new RemoteWebDriver(new URL(hub), capabilities);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        } else {
            init();
            return getWebDriver();
        }

    }

    public void proxy() {

        String proxyDetails = getProxyDetails();
        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setProxyType(MANUAL);
        proxy.setHttpProxy(proxyDetails);
        proxy.setSslProxy(proxyDetails);
        capabilities.setCapability(PROXY, proxy);

    }

    protected String getProxyDetails() {
        return String.format("%s:%d", Env.getProperty("proxy.host"), Integer.valueOf(Env.getProperty("proxy.port")));
    }

    protected abstract void init();

    public abstract WebDriver getWebDriver();

    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

}
