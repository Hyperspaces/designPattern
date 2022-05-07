package com.cc.pattern.prototype.deepCopy;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private String name;

    public Student(String name){
        this.name = name;
    }
}
