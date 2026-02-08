package com.gla.arrays.level2;
import java.util.Scanner;

class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight: ");
            double w = sc.nextDouble();

            System.out.print("Height: ");
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input, enter again");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = h;
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25)
                weightStatus[i] = "Normal";
            else if (personData[i][2] < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + "\t" + personData[i][1] + "\t" +
                    String.format("%.2f", personData[i][2]) + "\t" + weightStatus[i]);
        }
    }
}
