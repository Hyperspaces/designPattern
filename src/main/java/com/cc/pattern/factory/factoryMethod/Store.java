package com.cc.pattern.factory.factoryMethod;

import lombok.Data;

@Data
public class Store {

    private Factory coffeeFactory;

    public Store(Factory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }


    public AbstractCoffee getCoffee() {
        return coffeeFactory.getCoffee();
    }
}
