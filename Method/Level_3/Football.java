package com.gla.Method.Level_3;

import java.util.Scanner;
class Football{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[11];
        for(int i=0;i<11;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(mean(arr));
        System.out.println(shortest(arr));
        System.out.print(max(arr));

    }
    static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<11;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static double mean(int[] arr){
        double mean=sum(arr)/11;
        return mean;
    }
    static int shortest(int[] arr){
        int min=arr[0];
        for(int i=0;i<11;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<11;i++){
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
}
