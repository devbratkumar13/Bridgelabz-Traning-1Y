package com.gla.Inheritance.HybridInheritance;

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed);
    }
}
interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Charging electric vehicle");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}