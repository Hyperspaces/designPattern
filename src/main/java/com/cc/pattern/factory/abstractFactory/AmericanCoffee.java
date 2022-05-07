package com.cc.pattern.factory.abstractFactory;

import lombok.Data;

@Data
public class AmericanCoffee extends Coffee {

    private String name;

    public AmericanCoffee(){
        name = "美式咖啡";
    }

    @Override
    void addSugar() {
        System.out.println(name + "加糖");
    }

    @Override
    void addMilk() {
        System.out.println(name + "加奶");
    }
}
