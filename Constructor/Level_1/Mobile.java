package com.gla.Constructor.Level_1;
import java.util.Scanner;

class Mobile {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Mobile m = new Mobile();
        m.brand = in.nextLine();
        m.model = in.nextLine();
        m.price = in.nextDouble();

        m.displayDetails();
    }
}