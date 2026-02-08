package com.gla.Arrays;
import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number between 6 and 9:-");
        int number=sc.nextInt();
        int[] Table=new int[10];
        if(number<6 || number>9 ){
            System.out.println("Invalid Number! Please enter number between 6 and 9:-" );
            return;
        }
        for (int i = 1; i <= 10; i++) {
            Table[i - 1] = number * i;
        }
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + Table[i-1]);
        }

    }

}