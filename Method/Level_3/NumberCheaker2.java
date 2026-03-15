package com.gla.Method.Level_3;
import java.util.Scanner;
import java.util.Arrays;
class NumberCheacker2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] nums = storeDigits(num);
        System.out.println(countDigits(num));
        System.out.println(Arrays.toString(storeDigits(num)));
        System.out.println(sumDigits(nums));
        System.out.println(sumSquares(nums));
        System.out.println(Harshad(num));
        System.out.println(Arrays.deepToString(digitFrequency(nums)));
    }
    public static int countDigits(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int num){
        int count = countDigits(num);
        int arr[] = new int[count];

        for(int i = count-1; i >= 0; i--){
            arr[i] = num % 10;
            num /= 10;
        }

        return arr;
    }
    public static int sumDigits(int nums[]){
        int sum = 0;
        for(int d : nums){
            sum += d;
        }
        return sum;
    }

    // c. Sum of squares of digits
    public static int sumSquares(int nums[]){
        int sum = 0;

        for(int d : nums){
            sum += Math.pow(d,2);
        }

        return sum;
    }
    public static boolean Harshad(int num){
        int arr[] = storeDigits(num);
        int sum = sumDigits(arr);

        return num % sum == 0;
    }
    public static int[][] digitFrequency(int[] nums){

        int freq[][] = new int[10][2];

        for(int i = 0; i < 10; i++){
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for(int d : nums){
            freq[d][1]++;
        }

        return freq;
    }
}
