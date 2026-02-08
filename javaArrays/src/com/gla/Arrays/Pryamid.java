package com.gla.Arrays;
import java.util.Scanner;

public class Pryamid {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no");
        int n=5;
        for(int i=0; i<=n; i++){
            for (int j=0; j<=n-i-1; j++){
                System.out.print(" ");}
            for (int k=0; k<=i; k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }


}
