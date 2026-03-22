package com.gla.Inheritance.HybridInheritance;

public class Runner {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        PetrolVehicle pv = new PetrolVehicle("BMW M5 CS", 290);

        ev.displayDetails();
        ev.charge();

        System.out.println("----------------");

        pv.displayDetails();
        pv.refuel();
    }
}