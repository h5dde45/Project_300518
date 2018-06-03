package com.jc.p2.t5;

import java.math.BigInteger;
import java.security.SecureRandom;

public class SimpleProcess {
    public static final int TASK_COUNT = 500_000;

    public static void main(String[] args) {

        Long summa = 0L;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            SingleProcess singleProcess = new SingleProcess();
            singleProcess.start();
        }
        System.out.println(summa);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}

class SingleProcess extends Thread {
    @Override
    public void run() {
        process();
    }

    public Long process() {
        Long summa = 0L;
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < SimpleProcess.TASK_COUNT; i++) {
            String s = new BigInteger(500, random).toString(32);
            for (char c : s.toCharArray()) {
                summa += c;
            }
        }
        return summa;
    }
}
