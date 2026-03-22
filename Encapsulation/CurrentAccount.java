package com.gla.Encapsulation;

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan Approved: " + amount);
        } else {
            System.out.println("Loan Rejected");
        }
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 20000;
    }
}
