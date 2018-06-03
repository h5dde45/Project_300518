package com.jc.p2.t14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".", "pom.xml");

        Files.lines(path)
        .forEach(System.out::println);
    }
}
