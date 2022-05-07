package com.cc.pattern.singleton.lazy;

public class SingletonObject {

    private SingletonObject() {}

    private static SingletonObject singleton;

    public static SingletonObject getSingleton(){
        if(singleton == null){
            singleton = new SingletonObject();
        }
        return singleton;
    }
}
