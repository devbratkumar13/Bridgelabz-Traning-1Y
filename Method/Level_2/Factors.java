package com.gla.Method.Level_2;

import java.util.Scanner;
import java.util.Arrays;
class Factors{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Arrays.toString(fac(n)));
        int[] arr3 = fac(n);
        System.out.println(square(arr3));
    }
    static int[] fac(int n){
        int[] arr = new int[n];
        int index=0;
        for(int i=1;i<=arr.length;i++){
            if(n%i==0){
                arr[index] = i;
                index++;
            }
        }
        int[] arr1 = new int[index];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = arr[i];
        }
        return arr1;
    }
    static double square(int[] arr3){
        double sum=0;
        for(int i=0;i<arr3.length;i++){
            sum=sum+Math.pow(arr3[i],2);
        }
        return sum;
    }
}

