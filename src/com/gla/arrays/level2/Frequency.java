package com.gla.arrays.level2;
import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] freq = new int[10];

        temp = number;
        int index = 0;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
        }
    }
}

