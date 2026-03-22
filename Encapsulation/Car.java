package com.gla.Encapsulation;
class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.policyNumber = policyNumber;
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    public void getInsuranceDetails() {
        System.out.println("Car Insurance: " + calculateInsurance());
    }
}
