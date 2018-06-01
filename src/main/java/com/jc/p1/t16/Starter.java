package com.jc.p1.t16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Starter {
    public static void main(String[] args) throws IOException {
        readZip();
    }

    private static void readZip() throws IOException {
        ZipFile zipFile = new ZipFile("ziptest.zip");
        for (Enumeration<? extends ZipEntry> iter = zipFile.entries();
             iter.hasMoreElements(); ) {
            ZipEntry ze = iter.nextElement();
            System.out.println("Entry: " + ze.getName());
            if (!ze.isDirectory()) {
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(zipFile.getInputStream(ze)));
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("========================");
            }
        }

        zipFile.stream()
                .forEach(new NewZip(zipFile));
    }
}

class NewZip implements Consumer<ZipEntry> {
    private ZipFile zipFile;

    public NewZip(ZipFile zipFile) {
        this.zipFile = zipFile;
    }

    @Override
    public void accept(ZipEntry ze) {
        try {
            System.out.println("Entry: " + ze.getName());
            if (!ze.isDirectory()) {
                BufferedReader bufferedReader = null;

                bufferedReader = new BufferedReader(
                        new InputStreamReader(zipFile.getInputStream(ze)));

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("========================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}