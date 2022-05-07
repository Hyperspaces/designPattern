package com.cc.pattern.singleton.lazy;

public class DoubleCheckSingleton {

    private DoubleCheckSingleton() {}

    private volatile static DoubleCheckSingleton singleton;

    public static DoubleCheckSingleton getSingleton(){

        if(singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if(singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
