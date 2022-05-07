package com.cc.pattern.factory.factoryMethod;

public class AmericanCoffeeFactory implements Factory{
    @Override
    public AbstractCoffee getCoffee() {
        return new AmericanCoffee();
    }
}
