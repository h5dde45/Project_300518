package com.jc.p2.t14;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileSystem {
    public static void main(String[] args) {
        File file = new File(".");
//        file.delete();
//        System.out.println(file.exists());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
        System.out.println(Arrays.toString(file.list()));
        System.out.println(Arrays.toString(file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith(".");
            }
        })));
        System.out.println(Arrays.toString(file.listFiles()));
    }
}
