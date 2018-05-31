package com.jc.p1.t1;

public class Starter {
    public static void main(String[] args) {
        Cl1 cl1 = new Cl1();
        cl1.sayHello();
        NewInterface1.sayStatic();

        cl1.sayHi();

        Cl2 cl2 = new Cl2();

        cl2.sayHi();

        Cl3 cl3 = new Cl3();

        cl3.sayHi();
    }
}
