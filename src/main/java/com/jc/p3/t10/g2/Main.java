package com.jc.p3.t10.g2;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static class Counter {
        AtomicInteger x = new AtomicInteger();
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 1000_000; i++) {
                counter.x.getAndIncrement();
            }
        };
        List<Thread> threads = Stream.generate(() -> new Thread(runnable))
                .limit(10)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(counter.x);

    }
}
