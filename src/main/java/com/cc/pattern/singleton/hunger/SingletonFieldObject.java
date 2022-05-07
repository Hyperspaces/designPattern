package com.cc.pattern.singleton.hunger;

public class SingletonFieldObject {

    private SingletonFieldObject() {}

    private static SingletonFieldObject singleton = new SingletonFieldObject();

    public static SingletonFieldObject getSingleton(){
        return singleton;
    }
}
