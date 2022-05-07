package com.cc.pattern.singleton.hunger;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch =new CountDownLatch(100);

        AtomicInteger count = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                if(!doCompare() || !doFieldCompare()){
                    count.getAndIncrement();
                }
                latch.countDown();
            });
            t.start();
        }

        latch.await();
        System.out.println(count);
    }

    private static boolean doCompare(){
        SingletonObject singleton1 = SingletonObject.getSingleton();
        SingletonObject singleton2 = SingletonObject.getSingleton();
        return singleton1 == singleton2;
    }

    private static boolean doFieldCompare(){
        SingletonFieldObject singleton1 = SingletonFieldObject.getSingleton();
        SingletonFieldObject singleton2 = SingletonFieldObject.getSingleton();
        return singleton1 == singleton2;
    }
}
