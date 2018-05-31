package com.jc.p1.t1;

public interface NewInterface1 {
    void sayHello();

    default void sayHi(){
        System.out.println("hi 1");
    }

    static void sayStatic(){
        System.out.println("static1");
    }
}
