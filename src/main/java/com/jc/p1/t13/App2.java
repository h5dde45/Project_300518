package com.jc.p1.t13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.format("%02d", i));
        }
        System.out.println(list);

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        list.sort((o1, o2) -> o2.compareTo(o1));
//        Collections.sort(list, Comparator.reverseOrder());
//        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }
}
