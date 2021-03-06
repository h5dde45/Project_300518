package com.jc.p1.t24;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start runnable:" + Thread.currentThread().getId());
        try {
            Thread.sleep(3333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finish runnable:" + Thread.currentThread().getId());
    }
}
