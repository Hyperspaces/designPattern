package com.cc.pattern.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakClient {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<InnerClassSingleton> constructor = InnerClassSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        InnerClassSingleton innerClassSingleton1 = constructor.newInstance();
        InnerClassSingleton innerClassSingleton2 = constructor.newInstance();
        System.out.println(innerClassSingleton1 == innerClassSingleton2);
        System.out.println(InnerClassSingleton.getSingleton() == InnerClassSingleton.getSingleton());
    }
}
