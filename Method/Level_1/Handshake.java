package com.gla.Method.Level_1;
import java.util.Scanner;
class Handshake{
    public static void main(String[] args){
        Handshake h = new Handshake();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("maximum handshakes are :- " + h.handshake(n));
    }
    int handshake(int n){
        return n*(n-1)/2;
    }
}