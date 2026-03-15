package com.gla.Method.Level_1;

import java.util.Scanner;
class sum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(sum(n));
    }
    static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
