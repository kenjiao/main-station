package com.rongzi.ms.helpers;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Yuan on 2017/7/6.
 */
public class Env {

    private static Logger logger = Logger.getLogger(Env.class);

    private static Properties properties;

    static {

        properties = new Properties();

        try (InputStream in = ClassLoader.getSystemResourceAsStream("env.properties")) {
            properties.load(new InputStreamReader(in, "UTF-8"));
        } catch (IOException e) {
            logger.error(e);
        }

    }

    public static String getProperty(String key) {
        String property = System.getProperty(key);
        return StringUtils.isEmpty(property) ? properties.getProperty(key) : property;
    }

    public static String getProperty(String key, String defaultValue) {
        String property = getProperty(key);
        return StringUtils.isEmpty(property) ? defaultValue : property;
    }

    public static String getProfile() {
        return getProperty("profile", "default");
    }

    public static String getWebDriver() {
        return getProperty("webdriver", "default");
    }

}
