package com.cc.pattern.factory.factoryMethod;

public class LatteCoffeeFactory implements Factory {
    @Override
    public AbstractCoffee getCoffee() {
        return new LatteCoffee();
    }
}
