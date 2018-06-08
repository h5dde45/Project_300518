package com.jc.p4.t11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecServ {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("submit w1");
        Future<String> future1 = executorService.submit(new Worker("w1"));
        System.out.println("submit w2");
        Future<String> future2 = executorService.submit(new Worker("w3"));

        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println("9999999999999999999999999");

        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(new Worker("w3"),
                new Worker("w4"),
                new Worker("w5")
        ));

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }

        executorService.shutdown();

    }

    private static class Worker implements Callable<String> {
        private final String name;

        public Worker(String name) {
            this.name = name;
        }

        @Override
        public String call() throws Exception {
            long v = (long) (Math.random() * 10000);
            System.out.println(name + " start -> " + Thread.currentThread().getName());
            Thread.sleep(v);
            System.out.println(name + " finish");
            return name;
        }
    }
}
