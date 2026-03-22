package com.gla.Encapsulation;
class SavingAccount extends BankAccount implements Loanable {

    public SavingAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved: " + amount);
        } else {
            System.out.println("Loan Rejected");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}