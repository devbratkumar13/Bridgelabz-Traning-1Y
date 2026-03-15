package com.gla.Method.Level_2;

import java.util.Scanner;
class Recsum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(rec(n));
    }
    static int rec(int n){
        if(n==1){
            return 1;
        }
        return n + rec(n-1);
    }
}
