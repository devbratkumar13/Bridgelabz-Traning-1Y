package com.gla.Arrays;
import java.util.Scanner;
public class StoreMultiple {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (zero or negative to stop):- ");
            double input = sc.nextDouble();

            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array is full (10 elements).");
                break;
            }

            numbers[index] = input;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.print("\nYou entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of all numbers: " + total);
    }
}
