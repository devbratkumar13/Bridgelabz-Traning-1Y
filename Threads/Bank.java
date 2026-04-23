package com.gla.Threads;

class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println("User: " + name +
                    " | Type: " + type +
                    " | Priority: " + t.getPriority() +
                    " | Checking balance (" + i + ")");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount premiumUser = new BankAccount("Dev", "Premium");
        BankAccount regularUser = new BankAccount("Rahul", "Regular");
        BankAccount basicUser = new BankAccount("Aman", "Basic");

        Thread t1 = new Thread(premiumUser);
        Thread t2 = new Thread(regularUser);
        Thread t3 = new Thread(basicUser);

        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        t1.start();
        t2.start();
        t3.start();
    }
}
