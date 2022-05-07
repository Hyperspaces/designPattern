package com.cc.pattern.singleton.hunger;

public class SingletonObject {

    private SingletonObject() {}

    private static final SingletonObject singleton;

    static {
        singleton = new SingletonObject();
    }

    public static SingletonObject getSingleton(){
        return singleton;
    }
}
