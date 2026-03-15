package com.gla.Method.Level_1;
import java.util.Scanner;
class Athlete{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Athlete a = new Athlete();
        int dis = in.nextInt();
        int side1 = in.nextInt();
        int side2 = in.nextInt();
        int side3 = in.nextInt();
        System.out.print("rounds are " + a.rounds(side1,side2,side3,dis));
    }
    int rounds(int side1,int side2,int side3,int dis){
        return (side1+side2+side3)/dis;
    }
}
