package com.jc.p1.t2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFile6 {

    public static void main(String[] args) {
        final String fileName = "text.txt";
        List<String> list = readList(fileName);
        System.out.println("=============================");
        System.out.println(list);
    }

    private static List<String> readList(String fileName) {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    result.add(line);
                }
            }finally {
                bufferedReader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
