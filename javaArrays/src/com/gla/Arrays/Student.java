package com.gla.Arrays;

public class Student {

    int age ;
    int rollNo;
    String name;

    public void printInfo()
    {
        System.out.println("Name :- "+ name);
        System.out.println("Roll No :- "+ rollNo);
        System.out.println("Age :- "+ age);
    }

     public static void main(String[] args) {
        Student s1=new Student();
        int a1=s1.age=12;
        int r1=s1.rollNo=1;
        String name1=s1.name="Ram";
        s1.printInfo();
        System.out.println("----------------------------------------------------------");

        Student s2=new Student();
        int a2=s2.age=13;
        int r2=s2.rollNo=2;
        String n2=s2.name="Shyam";

        s2.printInfo();

    }
}