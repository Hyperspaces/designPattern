package com.cc.pattern.prototype.deepCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Certificate certificate = new Certificate();
        Student stu1 = new Student("张三");
        certificate.setStu(stu1);

        Certificate certificateClone = certificate.clone();
        certificateClone.getStu().setName("李四");
        
        certificate.show();
        certificateClone.show();
    }
}
