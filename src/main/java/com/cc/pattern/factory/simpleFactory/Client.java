package com.cc.pattern.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        AbstractCoffee coffee = store.getCoffee("american");
        //AbstractCoffee coffee = store.getCoffee("latte");
        coffee.addSugar();
        coffee.addMilk();
    }
}
