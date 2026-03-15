package com.gla.Constructor_Instances.Level1;

import java.util.Scanner;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }
    double calculateCost() {
        return rentalDays * 1000;
    }
    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String model = in.nextLine();
        int days = in.nextInt();
        CarRental c = new CarRental(name, model, days);
        c.display();
    }
}

