package com.gla.Encapsulation;
public class Runner1{
    public static void main(String[] args) {

        Product p1 = new Electronics(1, "Laptop", 50000);
        Product p2 = new Cloths(2, "Shirt", 2000);
        Product p3 = new Groceries(3, "Rice", 1000);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            p.displayDetails();
            System.out.println("Discount: " + p.calculateDiscount());

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                t.getTaxDetails();
            }

            System.out.println("----------------------");
        }
    }
}
