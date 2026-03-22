package com.gla.Interface.StaticMethodsInterface;

interface ConversionUtils {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}
public class Conversion {
    public static void main(String[] args) {
        double km = 10;
        double kg = 5;

        System.out.println("Miles: " + ConversionUtils.kmToMiles(km));
        System.out.println("Pounds: " + ConversionUtils.kgToLbs(kg));
    }
}
