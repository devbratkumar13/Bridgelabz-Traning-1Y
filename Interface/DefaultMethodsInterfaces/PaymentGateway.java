package com.gla.Interface.DefaultMethodsInterfaces;

interface Payment {

    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund processed: " + amount);
    }
}
class CreditCardPayment implements Payment {

    public void processPayment(double amount) {
        System.out.println("Credit Card Payment: " + amount);
    }
}
public class PaymentGateway {
    public static void main(String[] args) {

        Payment p = new CreditCardPayment();
        p.processPayment(5000);
        p.refund(2000);
    }
}
