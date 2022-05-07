package com.cc.pattern.factory.abstractFactory;

public class AmericanFactory implements Factory {
    @Override
    public Dessert getDessert() {
        return new Macaroon();
    }

    @Override
    public Coffee getCoffee() {
        return new AmericanCoffee();
    }
}
