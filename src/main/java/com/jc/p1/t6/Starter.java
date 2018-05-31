package com.jc.p1.t6;

import java.io.*;

public class Starter {
    public static void main(String[] args) {
        testWrite();
        First first = testRead();
        System.out.println(first);
    }

    private static First testRead() {
        try (
                FileInputStream fis = new FileInputStream("out.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            return (First) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void testWrite() {
        First first = new First();
        first.setFirstCode("FirstCode");
        first.setFirstName("FirstName");
        first.setProcessor(new ProcessorImpl());

        try (
                FileOutputStream f0s = new FileOutputStream("out.dat");
                ObjectOutputStream oos = new ObjectOutputStream(f0s)) {
            oos.writeObject(first);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}