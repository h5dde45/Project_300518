package com.jc.p1.t18;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date=new Date();
        date.setTime(date.getTime()+3600L*24*187*1000);
        System.out.println(date);
    }
}
