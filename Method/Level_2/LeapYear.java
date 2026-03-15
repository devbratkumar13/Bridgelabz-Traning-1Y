package com.gla.Method.Level_2;

import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.print(leap(year));
    }
    static boolean leap(int year){
        if(((year%4==0)&&(year%100!=0))||year%400==0){
            return true;
        }
        return false;
    }
}
