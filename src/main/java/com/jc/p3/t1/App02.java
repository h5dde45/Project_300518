package com.jc.p3.t1;

import java.util.stream.IntStream;

public class App02 {
    public static void main(String[] args) {
        IntStream.range(0, 77)
                .mapToObj((i) ->
                     String.valueOf(i) + "..."
                )
                .filter(s -> s.contains("3"))
                .forEach(System.out::println);
    }
}
