package com.gla.Method.Level_3;

import java.util.Scanner;
import java.util.Arrays;
class NumberCheacker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int[] nums = storeDigits(num);
        System.out.println(countDigits(num));
        System.out.println(Arrays.toString(storeDigits(num)));
        System.out.println(DuckNumber(num));
        System.out.println(Armstrong(num));
        largestTwo(nums);
        smallestTwo(nums);
    }
    public static int countDigits(int num) {
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int num) {
        int count = countDigits(num);
        int arr[] = new int[count];

        for(int i = count-1; i >= 0; i--){
            arr[i] = num % 10;
            num = num / 10;
        }

        return arr;
    }
    public static boolean DuckNumber(int num) {
        int digits[] = storeDigits(num);

        for(int i = 1; i < digits.length; i++){
            if(digits[i] == 0)
                return true;
        }
        return false;
    }
    public static boolean Armstrong(int num) {
        int digits[] = storeDigits(num);
        int power = digits.length;

        int sum = 0;

        for(int i=0;i<digits.length;i++){
            sum += Math.pow(digits[i], power);
        }

        return sum == num;
    }
    public static void largestTwo(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
    public static void smallestTwo(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            }
            else if(nums[i] < secondSmallest && nums[i] != smallest){
                secondSmallest = nums[i];
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}
