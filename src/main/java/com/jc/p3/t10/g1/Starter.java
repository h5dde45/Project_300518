package com.jc.p3.t10.g1;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        Container container = new Container();
        Runnable runnable = () -> {
            for (int i = 0; i < 100_000; i++) {
                container.addEntry("f");
            }
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }


        System.out.println(container.size());
    }
}
