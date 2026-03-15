package com.gla.Method.Level_1;

import java.util.Scanner;
class Nature{
    public static void main(String[] args){
        Nature m = new Nature();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Number are :- " + m.Nature(n));
    }
    int Nature(int n){
        if(n<0){
            return -1;
        }
        else if(n==0){
            return 0;
        }
        return 1;
    }
}
