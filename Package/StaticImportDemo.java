package com.gla.Package;
import static java.lang.Math.*;

class StaticImportDemo {
    public static void main(String[] args) {

        double num = 25;

        double squareRoot = sqrt(num);
        double power = pow(2, 3);
        int maximum = max(10, 20);
        int minimum = min(10, 20);
        int absolute = abs(-15);

        System.out.println("Square Root: " + squareRoot);
        System.out.println("Power (2^3): " + power);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Absolute Value: " + absolute);
    }
}
