package com.gla.Constructor.Level_2;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;

    char calculateGrade() {
        if(marks >= 90){
            return 'A';
        }
        else if(marks >= 75){
            return 'B';
        }
        else if(marks >= 60){
            return 'C';
        }
        else if(marks >= 40){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student s = new Student();
        s.rollNumber = in.nextInt();
        in.nextLine();
        s.name = in.nextLine();
        s.marks = in.nextInt();

        s.displayDetails();
    }
}