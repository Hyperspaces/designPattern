package com.cc.pattern.builder.build;

public class XiaoMiBuilder extends AbstractBuilder{
    @Override
    void buildCpu() {
        phone.setCpu("天玑");
    }

    @Override
    void buildMainboard() {
        phone.setMainboard("小米");
    }

    @Override
    void buildScreen() {
        phone.setScreen("三星");
    }

    @Override
    void buildMemory() {
        phone.setMemory("第四代");
    }

    @Override
    Phone build() {
        return phone;
    }
}
