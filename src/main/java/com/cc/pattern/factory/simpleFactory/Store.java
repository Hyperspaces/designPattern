package com.cc.pattern.factory.simpleFactory;

public class Store {

    public AbstractCoffee getCoffee(String type) {
        return ReflexCoffeeFactory.getCoffee(type);
    }
}
