package com.jc.p1.t9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) {
        Second second = testRead();
        System.out.println(second);
    }

    private static Second testRead() {
        try (
                FileInputStream fis = new FileInputStream("writer3.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (Second) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
