package com.jc.p1.t27;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        List<Callable<Long>> tasks2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            NewCall newCall = new NewCall();
            Future<Long> future = executorService.submit(newCall);
            futures.add(future);
            tasks2.add(newCall);
        }

        for (Future<Long> future : futures) {
            future.get();
        }

        System.out.println("=================1");

        List<Future<Long>> futures1 = executorService.invokeAll(tasks2);
        for (Future<Long> future : futures1) {
            future.get();
        }
        System.out.println("=================2");
        executorService.shutdown();
    }
}

class NewCall implements Callable<Long> {
    @Override
    public Long call() {
        try {
            System.out.println("start: " + Thread.currentThread().getId());
            Thread.sleep(1000 + Math.round(Math.random() * 5000));
            System.out.println("finish: " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Thread.currentThread().getId();
    }
}