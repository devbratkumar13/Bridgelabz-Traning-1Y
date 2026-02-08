package com.gla.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public int add(int num1,int num2)
    {
        return num1+num2;
    }


    public int sub(int num1,int num2)
    {
        return num1-num2;
    }
    public int mul(int num1,int num2)
    {
        return num1*num2;
    }
    public int div(int num1,int num2)
    {
        return num1/num2;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number :- ");
        int a=sc.nextInt();
        System.out.println("Enter your second number :- ");
        int b=sc.nextInt();

        Calculator c1=new Calculator();

        int addition=c1.add(a,b);
        System.out.println("Addition of two numbers :- "+addition);
        int subtaction=c1.sub(a,b);
        System.out.println("Subtraction of two numbers :-"+subtaction);
        int multiplication=c1.mul(a,b);
        System.out.println("Multiplication of two numbers :-"+multiplication);
        int division=c1.div(a,b);
        System.out.println("Division of two numbers :-"+division);


    }
}
