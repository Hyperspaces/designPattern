package com.cc.pattern.builder.build;

public class Client {
    public static void main(String[] args) {
        //AbstractBuilder builder = new XiaoMiBuilder();
        AbstractBuilder builder = new HuaweiBuilder();

        Director director = new Director(builder);
        Phone phone = director.build();
        System.out.println(phone);
    }
}
