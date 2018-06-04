package com.jc.p3.t1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<List<String>> input = Arrays.asList(Arrays.asList("a", "b", "c"),
                Arrays.asList("x", "y"), Arrays.asList("1", "2", "3"));

        Stream<String> stream =
                input.get(0).stream().flatMap(a ->
                input.get(1).stream().flatMap(b ->
                        input.get(2).stream().map(c -> a + b + c)));

        stream.forEach(System.out::println);

    }
}
