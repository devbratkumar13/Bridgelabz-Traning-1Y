package com.gla.Encapsulation;
import java.util.*;

public class Runner2 {
    public static void main(String[] args) {

        Vehicle v1 = new Car("UP81A1234", 2000, "C101");
        Vehicle v2 = new Bike("UP81B5678", 500, "B202");
        Vehicle v3 = new Truck("UP81T9999", 4000, "T303");

        Vehicle[] vehicles = {v1, v2, v3};

        int days = 3;

        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost: " + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                i.getInsuranceDetails();
            }

            System.out.println("----------------------");
        }
    }
}
