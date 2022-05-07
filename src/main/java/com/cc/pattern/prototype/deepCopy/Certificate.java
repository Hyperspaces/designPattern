package com.cc.pattern.prototype.deepCopy;

import jdk.nashorn.internal.parser.JSONParser;
import lombok.Data;

import java.io.*;

@Data
public class Certificate implements Cloneable, Serializable {

    private Student stu;

    public void show(){
        System.out.println(stu.getName() + "表现优异，故获此证书！");
    }

    @Override
    protected Certificate clone() throws CloneNotSupportedException {

        Certificate clone = null;
        String file = "D:/a.txt";
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(this);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            clone = (Certificate) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
