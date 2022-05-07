package com.cc.pattern.builder.chainBuild;

import lombok.Data;

@Data
public class Phone {
    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.mainboard = builder.mainboard;
        this.screen = builder.screen;
        this.memory = builder.memory;
    }

    private String cpu;
    private String mainboard;
    private String screen;
    private String memory;

    public static class Builder{

        private String cpu;
        private String mainboard;
        private String screen;
        private String memory;

        public Builder buildCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder buildMainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        public Builder buildScreen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder buildMemory(String memory){
            this.memory = memory;
            return this;
        }

        public Phone structure(){
            return new Phone(this);
        }
    }
}
