package com.cc.pattern.builder.build;

public abstract class AbstractBuilder {
    protected Phone phone = new Phone();
    abstract void buildCpu();
    abstract void buildMainboard();
    abstract void buildScreen();
    abstract void buildMemory();
    abstract Phone build();
}
