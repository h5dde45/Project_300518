package com.jc.p1.t21;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Starter {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2018,6,2,9,53,23);
        System.out.println(localDateTime);

        LocalDate localDate=LocalDate.from(localDateTime);
        System.out.println(localDate);

    }
}
