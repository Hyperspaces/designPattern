package com.cc.pattern.factory.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReflexCoffeeFactory {

    private static Map<String,AbstractCoffee> map = new HashMap<>();

    static {
        Properties p = new Properties();
        InputStream resourceAsStream = ReflexCoffeeFactory.class.getClassLoader().getResourceAsStream("factory.properties");
        try {
            p.load(resourceAsStream);
            Set<Object> keySet = p.keySet();
            for (Object key : keySet) {
                String className = p.getProperty((String) key);
                Object o = Class.forName(className).newInstance();
                map.put((String) key,(AbstractCoffee) o);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static AbstractCoffee getCoffee(String type){

        return map.get(type);
    }
}
