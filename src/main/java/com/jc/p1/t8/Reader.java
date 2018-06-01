package com.jc.p1.t8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) {
        First first = testRead();
        System.out.println(first);
    }

    private static First testRead() {
        try (
                FileInputStream fis = new FileInputStream("writer.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (First) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
