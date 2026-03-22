package com.gla.Encapsulation;

class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.policyNumber = policyNumber;
    }

    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public void getInsuranceDetails() {
        System.out.println("Bike Insurance: " + calculateInsurance());
    }
}