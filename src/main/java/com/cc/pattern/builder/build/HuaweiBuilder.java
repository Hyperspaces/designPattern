package com.cc.pattern.builder.build;

public class HuaweiBuilder extends AbstractBuilder{
    @Override
    void buildCpu() {
        phone.setCpu("骁龙");
    }

    @Override
    void buildMainboard() {
        phone.setMainboard("华为");
    }

    @Override
    void buildScreen() {
        phone.setScreen("大猩猩玻璃");
    }

    @Override
    void buildMemory() {
        phone.setMemory("第三代");
    }

    @Override
    Phone build() {
        return phone;
    }
}
