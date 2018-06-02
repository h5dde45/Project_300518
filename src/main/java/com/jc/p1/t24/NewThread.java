package com.jc.p1.t24;

public class NewThread extends Thread {
    @Override
    public void run() {
        System.out.println("start thread:"+getId());
        try {
            Thread.sleep(3333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("finish thread:"+getId());
    }
}
