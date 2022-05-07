package com.cc.pattern.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        //Factory factory = new AmericanFactory();
        Factory factory = new ItalyFactory();
        Store store = new Store(factory);
        Coffee coffee = store.getCoffee();
        Dessert dessert = store.getDessert();
        coffee.addSugar();
        coffee.addMilk();
        dessert.Piping();
    }
}
