package com.jc.p2.t5;

import java.util.Date;

public class ThreadSynchr {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {
            Process process = new Process(counter);
            new Thread(process).start();
        }

        Thread.sleep(1222);
        System.out.println(counter.getCounter());
        Date date = new Date(1449965478867L);
        System.out.println(date);
    }
}

class Counter {
    private static Long counter = 0L;

    public void increase() {
        counter++;
    }

    public Long getCounter() {
        return counter;
    }
}

class Process implements Runnable {
    private Counter counter;

    public Process(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increase();
        }
    }
}