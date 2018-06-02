package com.jc.p1.t26;

import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

//        Future<?> future = executorService.submit(new NewRunnable());
        Future<Integer> future = executorService.submit(new NewCallable());
        Thread.sleep(1111);
        future.cancel(true);
//        while (!future.isDone()){
//            System.out.println("=====");
//            Thread.sleep(1111);
//        }

//        System.out.println(future.get());
        System.out.println(future.isCancelled());

        System.out.println("shutdown");
        executorService.shutdown();
    }
}

class NewRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("start : " + Thread.currentThread().getId());
            Thread.sleep(3333);
            System.out.println("finish: " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class NewCallable implements Callable<Integer> {

    @Override
    public Integer call() {
        try {
            System.out.println("start : " + Thread.currentThread().getId());
            Thread.sleep(3333);
            System.out.println("finish : " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 11;
    }
}