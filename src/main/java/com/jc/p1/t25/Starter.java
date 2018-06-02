package com.jc.p1.t25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Starter {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newWorkStealingPool();
        ExecutorService executorService = Executors.newFixedThreadPool(10, new NewFactory());

        for (int i = 0; i < 20; i++) {
            executorService.submit(new NewRunnable());
        }

//        executorService.awaitTermination(20_000, TimeUnit.MILLISECONDS);
        executorService.shutdown();
    }
}

class SimpleThread extends Thread {

    public SimpleThread(Runnable r) {
        super(r);
    }
}

class NewFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return new SimpleThread(r);
    }
}