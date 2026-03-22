package com.gla.Encapsulation;

class Cloths extends Product implements Taxable {
    public Cloths(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public void getTaxDetails() {
        System.out.println("Clothing Tax: " + calculateTax());
    }
}
