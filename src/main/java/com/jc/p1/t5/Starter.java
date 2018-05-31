package com.jc.p1.t5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class Starter {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "%1$tY %1$tm %1$td %1$tR переведена сумма в размере %2$5.2f руб. по счету %3$s %n";

//        String answer = String.format(s, new Date(), 99.8, "AC12345");
        String answer = String.format(Locale.forLanguageTag("ru"), s, new Date(), 99.8, "AC12345");
        System.out.println(answer);

        try (Formatter formatter = new Formatter(new File("out.txt"))){
            formatter.format(s, new Date(), 99.8, "AC12345");
            formatter.format(s, new Date(), 99.8, "AC12345");
            formatter.format(s, new Date(), 99.8, "AC12345");
            formatter.format(s, new Date(), 99.8, "AC12345");
        }
    }
}
