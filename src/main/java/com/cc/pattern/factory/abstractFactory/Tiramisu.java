package com.cc.pattern.factory.abstractFactory;

public class Tiramisu extends Dessert{
    private String name;

    public Tiramisu(){
        name = "提拉米苏";
    }
    @Override
    void Piping() {
        System.out.println(name+"裱花");
    }
}
