package com.gla.Encapsulation;
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public void getTaxDetails() {
        System.out.println("Electronics Tax: " + calculateTax());
    }
}