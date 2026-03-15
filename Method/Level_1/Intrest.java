package com.gla.Method.Level_1;

import java.util.Scanner;
class Intrest{
    public static void main(String[] args){
        Intrest s = new Intrest();
        Scanner in = new Scanner(System.in);
        int principle = in.nextInt();
        double rate = in.nextDouble();
        int time = in.nextInt();
        s.Interest(principle,rate,time);
    }
    void Interest(int principle,double rate,int time){
        System.out.println(principle*rate*time/100);
    }
}
