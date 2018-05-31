package com.jc.p1.t4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TextFile7 {

    public static void main(String[] args) {
        final String fileName = "text.txt";
        List<String> list = readList_7(fileName);
        System.out.println("=============================");
        System.out.println(list);

//        SortedMap<String, Charset> map = Charset.availableCharsets();
//        for (Map.Entry<String, Charset> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " => " + entry.getValue());
//        }
    }

    private static List<String> readList_7(String fileName) {
        List<String> result = new ArrayList<>();

        try (InputStreamReader inputStreamReader =
                     new InputStreamReader(new FileInputStream(fileName), "utf-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return result;
    }

}
