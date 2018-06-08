package com.jc.p4.t11;

public class Starter {
    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(0);
        new DepositThread(account).start();
        account.withdraw(50_000_000L);
        System.out.println(account.getBalance());
    }

    private static class DepositThread extends Thread {
        private final Account account;

        public DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 60_000_000L; i++) {
                account.deposit(1);
            }
        }
    }
}
