package com.cc.pattern.factory.abstractFactory;

public class Macaroon extends Dessert{

    private String name;

    Macaroon(){
        name = "马卡龙";
    }

    @Override
    void Piping() {
        System.out.println(name+"裱花");
    }
}
