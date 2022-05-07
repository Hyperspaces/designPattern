package com.cc.pattern.builder.chainBuild;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .buildMainboard("小米")
                .buildScreen("三星")
                .buildCpu("联发科")
                .buildMemory("第五代")
                .structure();

        System.out.println(phone);
    }
}
