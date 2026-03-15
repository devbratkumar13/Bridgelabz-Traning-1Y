package com.gla.Constructor.Level_2;

import java.util.Scanner;
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        if(balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount b = new BankAccount();
        b.accountNumber = in.nextInt();
        in.nextLine();
        b.accountHolder = in.nextLine();
        b.balance = in.nextDouble();
        double depositAmount = in.nextDouble();
        b.deposit(depositAmount);
        double withdrawAmount = in.nextDouble();
        b.withdraw(withdrawAmount);
        b.displayBalance();
    }
}
