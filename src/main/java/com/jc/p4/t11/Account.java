package com.jc.p4.t11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final Lock lock = new ReentrantLock();
    private final Condition balanceIncreased = lock.newCondition();
    private long balance;

    public Account() {
        this(0);
    }

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public void deposit(long amount) {
        lock.lock();
        try {
            balance += amount;
            balanceIncreased.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(long amount) throws InterruptedException {
        lock.lock();
        try {
            while (balance < amount) {
                balanceIncreased.await();
            }
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }
}
