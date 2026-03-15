package com.gla.Constructor.Level_1;
import java.util.Scanner;
public class Circle {
    double radius;
    void calculate() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle c = new Circle();
        c.radius = in.nextDouble();
        c.calculate();
    }
}
