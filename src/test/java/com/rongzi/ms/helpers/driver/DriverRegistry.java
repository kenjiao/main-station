package com.rongzi.ms.helpers.driver;

import com.rongzi.ms.helpers.driver.ChromeBuilder.ChromeMeta;
import com.rongzi.ms.helpers.driver.DriverBuilder.DriverMeta;
import com.rongzi.ms.helpers.driver.FirefoxBuilder.FirefoxMeta;
import com.rongzi.ms.helpers.driver.InternetExplorerBuilder.InternetExplorereMeta;
import com.rongzi.ms.helpers.driver.PhantomjsBuilder.PhantomjsMeta;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Yuan on 2017/4/28.
 */
public class DriverRegistry {

    private static Map<String, DriverMeta> registry = new LinkedHashMap<>();

    static {
        register(new ChromeMeta());
        register(new FirefoxMeta());
        register(new PhantomjsMeta());
        register(new InternetExplorereMeta());
    }

    public static DriverMeta getMeta(String type) {
        if (type == null) {
            throw new IllegalArgumentException("driver type is not specified");
        }
        if (registry.containsKey(type.toLowerCase())) {
            return registry.get(type);
        } else {
            throw new IllegalArgumentException("Unknown driver type " + type);
        }
    }

    public static void register(DriverMeta meta) {
        registry.put(meta.getType(), meta);
    }

}
