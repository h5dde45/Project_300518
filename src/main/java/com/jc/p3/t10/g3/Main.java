package com.jc.p3.t10.g3;

public class Main {
    private static class Foo{
        int x=0;
        volatile int y=0;
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100_000; i++) {
            Foo foo = new Foo();
            Thread t1 = new Thread(() -> {
                foo.x = 1;
                foo.y = 1;
            });
            Thread t2 = new Thread(() -> {
                while (foo.y!=1){

                }
                System.out.println(foo.x);
            });
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }
    }
}
