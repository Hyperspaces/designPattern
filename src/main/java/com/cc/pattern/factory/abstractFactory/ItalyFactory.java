package com.cc.pattern.factory.abstractFactory;

public class ItalyFactory implements Factory {
    @Override
    public Dessert getDessert() {
        return new Tiramisu();
    }

    @Override
    public Coffee getCoffee() {
        return new LatteCoffee();
    }
}
