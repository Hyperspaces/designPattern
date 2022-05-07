package com.cc.pattern.builder.build;

public class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder){
        this.builder = builder;
    }

    public Phone build(){
        builder.buildMainboard();
        builder.buildCpu();
        builder.buildMemory();
        builder.buildScreen();
        return builder.build();
    }
}
