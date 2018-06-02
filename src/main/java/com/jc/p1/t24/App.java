package com.jc.p1.t24;

public class App {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new NewThread().start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(new NewRunnable()).start();
        }
    }
}
