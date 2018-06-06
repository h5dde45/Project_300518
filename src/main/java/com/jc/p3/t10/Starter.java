package com.jc.p3.t10;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            Container container = new Container();
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


        System.out.println(Container.list.size());
    }
}
