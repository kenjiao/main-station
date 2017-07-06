package com.rongzi.ms.step_definitions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Yuan on 2017/7/6.
 */
public class Env {

    private static Properties properties;

    static {

        properties = new Properties();

        try (InputStream in = ClassLoader.getSystemResourceAsStream("env.properties")) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

}
