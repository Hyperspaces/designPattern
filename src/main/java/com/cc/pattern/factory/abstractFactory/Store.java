package com.cc.pattern.factory.abstractFactory;

import lombok.Data;

@Data
public class Store {

    private Factory factory;

    public Store(Factory factory){
        this.factory = factory;
    }


    public Coffee getCoffee() {
        return factory.getCoffee();
    }

    public Dessert getDessert() {
        return factory.getDessert();
    }
}
