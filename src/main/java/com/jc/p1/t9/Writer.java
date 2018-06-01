package com.jc.p1.t9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {
    public static void main(String[] args) {
        testWrite();
    }


    private static void testWrite() {
        Second second = new Second();
        second.setFirstCode("FirstCode ");
        second.setFirstName("FirstName ");
        second.setSecondCode("SecondCode ");
        second.setSecondName("SecondName ");

        try (
                FileOutputStream f0s = new FileOutputStream("writer3.dat");
                ObjectOutputStream oos = new ObjectOutputStream(f0s)) {
            oos.writeObject(second);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
