package com.cc.pattern.singleton.lazy;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch =new CountDownLatch(100);

        AtomicInteger count = new AtomicInteger();
        AtomicInteger safeCount1 = new AtomicInteger();
        AtomicInteger safeCount2 = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                if(!doCompare()){
                    count.getAndIncrement();
                }
                if(!doDoubleCheckCompare()){
                    safeCount1.getAndIncrement();
                }
                if(!doInnerClassCompare()){
                    safeCount2.getAndIncrement();
                }
                latch.countDown();
            });
            t.start();
        }

        latch.await();
        System.out.println(count);
        System.out.println(safeCount1);
        System.out.println(safeCount2);
    }

    private static boolean doCompare(){
        SingletonObject singleton1 = SingletonObject.getSingleton();
        SingletonObject singleton2 = SingletonObject.getSingleton();
        return singleton1 == singleton2;
    }

    private static boolean doDoubleCheckCompare(){
        DoubleCheckSingleton singleton1 = DoubleCheckSingleton.getSingleton();
        DoubleCheckSingleton singleton2 = DoubleCheckSingleton.getSingleton();
        return singleton1 == singleton2;
    }

    private static boolean doInnerClassCompare(){
        InnerClassSingleton singleton1 = InnerClassSingleton.getSingleton();
        InnerClassSingleton singleton2 = InnerClassSingleton.getSingleton();
        return singleton1 == singleton2;
    }
}
