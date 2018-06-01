package com.jc.p1.t13;

import java.io.File;
import java.io.FileFilter;

public class Starter {
    public static void main(String[] args) {

        File src = new File(".");
//        File[] files = src.listFiles(new NewFilter());

//        File[] files = src.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory();
//            }
//        });

//        File[] files = src.listFiles(pathname -> pathname.isDirectory());

        File[] files = src.listFiles(File::isDirectory);

        for (File file:files){
            System.out.println(file.getName());
        }

    }
    private static class NewFilter implements FileFilter{

        @Override
        public boolean accept(File pathname) {
            return pathname.isDirectory();
        }
    }
}
