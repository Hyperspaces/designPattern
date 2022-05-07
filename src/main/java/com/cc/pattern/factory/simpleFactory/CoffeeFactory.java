package com.cc.pattern.factory.simpleFactory;

public class CoffeeFactory {

    public static AbstractCoffee getCoffee(String type){
        if("american".equals(type)){
            return new AmericanCoffee();
        }else if(("latte").equals(type)){
            return new LatteCoffee();
        }else{
            return null;
        }
    }

}
