package com.cc.pattern.prototype.shallowCopy;

import lombok.Data;

@Data
public class Certificate implements Cloneable {

    private Student stu;

    public void show(){
        System.out.println(stu.getName() + "表现优异，故获此证书！");
    }

    @Override
    protected Certificate clone() throws CloneNotSupportedException {
        return (Certificate) super.clone();
    }
}
