package com.gla.Encapsulation;
public class Runner3 {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingAccount(101021, "Rishab", 150000);
        BankAccount acc2 = new CurrentAccount(102154, "Devbrat", 200000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();

            acc.deposit(2000);
            acc.withdraw(1000);

            System.out.println("Updated Balance: " + acc.getBalance());
            System.out.println("Interest: " + acc.calculateInterest());

            Loanable loan = (Loanable) acc;
            loan.applyForLoan(50000);

            System.out.println("----------------------");
        }
    }
}

