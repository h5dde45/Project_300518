package com.jc.p3.t5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        List<Integer> list = Arrays.asList(integers);
        System.out.println(list);
        list.set(2, 45);
        System.out.println(list);
//        list.add(33);
//        System.out.println(list);

        System.out.println("============");

        HashMap<String, String> map = new HashMap<>();

        map.put("1", " 4trrf");
        map.put("2", "r");
        map.put("3", "rtgb  rt  ");
        map.put("4", " rt   ");

        map.forEach((s, s2) -> System.out.println(s + ", " + s2));
        map.replaceAll((s, s2) -> s2.trim());
        map.forEach((s, s2) -> System.out.println(s + ", " + s2));
        map.entrySet().removeIf(entry -> entry.getValue().equals("r"));
        map.forEach((s, s2) -> System.out.println(s + ", " + s2));
        map.values().removeAll(Arrays.asList("rt","rtgb  rt"));
        map.forEach((s, s2) -> System.out.println(s + ", " + s2));

    }
}
