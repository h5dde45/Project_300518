package com.jc.p3.t9;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];
        readFully(System.in, bytes);
        System.out.println(Arrays.toString(bytes));
    }

    private static void readFully(InputStream in, byte[] bytes) throws IOException {
        int offset = 0;
        while (offset < bytes.length) {
            int count = in.read(bytes, offset, bytes.length - offset);
            if (count == -1) {
                throw new IOException("Stream has less than " + bytes.length + " bytes");
            }
            offset += count;
        }
    }
}
