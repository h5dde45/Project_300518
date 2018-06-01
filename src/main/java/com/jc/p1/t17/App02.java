package com.jc.p1.t17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class App02 {
    private static final String FILE = "test2.zip";

    public static void main(String[] args) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream(FILE));

        createZipDir(zos, new File(".").listFiles(), "");
//        File[] x = new File(".").listFiles();
//        for(File file:x) {
//            if(file.isDirectory())
//            System.out.println(file);
//        }
        zos.close();
    }

    private static void createZipDir(ZipOutputStream zos, File[] files, String path) throws IOException {
        for (File file : files) {
            if (file.isDirectory()) {
                createZipDir(zos, file.listFiles(), path + file.getName() + "/");
            } else if (!file.getName().equals(FILE)){
                ZipEntry zipEntry = new ZipEntry(path + file.getName());
                zos.putNextEntry(zipEntry);

                FileInputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[1024];
                int size = -1;
                while ((size = inputStream.read(bytes)) != -1) {
                    zos.write(bytes, 0, size);
                }
            }
        }
    }
}
