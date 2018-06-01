package com.jc.p1.t17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Starter {
    public static void main(String[] args) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(
                new FileOutputStream("data/test.zip"));

        ZipEntry zipEntry1 = new ZipEntry("name1.txt");
        zipOutputStream.putNextEntry(zipEntry1);
        zipOutputStream.write("super1".getBytes());

        ZipEntry zipEntry2 = new ZipEntry("name2.txt");
        zipOutputStream.putNextEntry(zipEntry2);
        zipOutputStream.write("super2".getBytes());

        zipOutputStream.close();
    }
}
