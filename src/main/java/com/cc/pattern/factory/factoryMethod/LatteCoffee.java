package com.cc.pattern.factory.factoryMethod;

import lombok.Data;

@Data
public class LatteCoffee extends AbstractCoffee {

    private String name;

    public LatteCoffee(){
        name = "拿铁咖啡";
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
