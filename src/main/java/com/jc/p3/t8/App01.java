package com.jc.p3.t8;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 5)
                .boxed()
                .collect(Collectors.toList());

        Collections.shuffle(collect);
        collect.forEach(System.out::println);
        System.out.println("==================");
        IntStream.iterate(1, operand -> operand * 2)
                .limit(10)
                .sorted()
                .forEach((x) -> System.out.print(x + ", "));
        System.out.println();
        System.out.println("==================");

        long count = Stream.of("33", "27", "89", "211")
                .filter(s -> s.startsWith("2"))
                .count();
        System.out.println(count);

        System.out.println("==================");
        long count1 = Stream.of(1, 2, 3, 4, 5)
                .peek((x) -> System.out.print(x + " "))
                .count();
        System.out.println(count1);

        System.out.println("==================");
        Stream.of("rdyh", "t5h5tt", "wertyu", "iyiuy7", "tsddryty", "g5yrttv", "lp[lp]")
                .filter(s -> s.startsWith("t"))
                .findFirst()
                .map(s -> s.substring("--".length()))
                .ifPresent(s -> System.out.println("=>" + s));

        System.out.println("==================");
        boolean b = Stream.of("rdyh", "t5h5tt", "wertyu", "iyiuy7", "tsddryty", "g5yrttv", "lp[lp]")
                .anyMatch(s -> s.startsWith("t"));
        System.out.println(b);

        System.out.println("==================");
        List<List<String>> listList = Arrays.asList(Arrays.asList("qwwe", "asd", "zxc"),
                Arrays.asList("rty", "fgh", "vbn"),
                Arrays.asList("456", "33"));
        System.out.println(listList.stream()
                .flatMap(List::stream)
                .peek(System.out::println)
                .anyMatch("fgh"::equals));

        System.out.println("==================");
        BigInteger reduce = IntStream.rangeClosed(1, 5)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println(reduce);

//        System.out.println("==================");
//        List<String> list = Arrays.asList(" 3rty", "  ", "   f5gh","", " v  8bn");
//        List<String> result = new ArrayList<>();
//        list.stream()
//                .map(String::trim)
//                .filter(s -> !s.isEmpty())
//                .forEach(result::add);
//        System.out.println(result);

        System.out.println("==================");
        List<String> list = Arrays.asList(" 3rty", "  ", "   f5gh","", " v  8bn");
        List<String> result =
        list.stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
