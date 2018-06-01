package com.jc.p1.t15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Starter {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            persons.add(new Person("Name_" + i, Math.random() + 1));
        }

        List<Double> collect = persons
                .stream()
                .map(Person::getGrade)
                .filter(aDouble -> aDouble > 1.5)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
        System.out.println("=================");
        persons
                .stream()
                .map(Person::getName)
                .filter(s -> s.contains("4"))
                .forEach(System.out::println);
    }
}
