package com.cc.pattern.factory.factoryMethod;

public class Client {
    public static void main(String[] args) {
        //Factory factory = new AmericanCoffeeFactory();
        Factory factory = new LatteCoffeeFactory();
        Store store = new Store(factory);
        AbstractCoffee coffee = store.getCoffee();
        coffee.addSugar();
        coffee.addMilk();
    }
}
