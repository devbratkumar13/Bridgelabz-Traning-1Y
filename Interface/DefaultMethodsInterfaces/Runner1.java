package com.gla.Interface.DefaultMethodsInterfaces;

public class Runner1 {
    public static void main(String[] args) {

        Vehicle v = new ElectricVehicle();
        v.displaySpeed();
        v.displayBattery();
    }
}
