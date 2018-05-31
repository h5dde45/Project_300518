package com.jc.p1.t3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextFile7 {

    public static void main(String[] args) {
        final String fileName = "text.txt";
//        List<String> list = readList_7(fileName);
        List<String> list = readList_7_2(fileName);
        System.out.println("=============================");
        System.out.println(list);
    }

    private static List<String> readList_7(String fileName) {
        List<String> result = new ArrayList<>();

        try (FileReader in = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(in)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return result;
    }

    private static List<String> readList_7_2(String fileName) {

        try {
           return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return Collections.EMPTY_LIST;
    }
}
