package com.jc.p1.t8;

import com.jc.p1.t6.ProcessorImpl;

import java.io.*;

public class Writer {
    public static void main(String[] args) {
        testWrite();
    }


    private static void testWrite() {
        First first = new First();
        first.setFirstCode("FirstCode ");
        first.setFirstName("FirstName ");
//        first.setFirstOther("FirstOther ");
        first.setProcessor(new ProcessorImpl());

        try (
                FileOutputStream f0s = new FileOutputStream("writer.dat");
                ObjectOutputStream oos = new ObjectOutputStream(f0s)) {
            oos.writeObject(first);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
