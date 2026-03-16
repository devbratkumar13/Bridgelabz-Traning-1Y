package com.gla.Package;

public class Faculty {
    public void displayFaculty() {
        System.out.println("Faculty Name: Dr. Sharma");
        System.out.println("Subject: Computer Science");
    }

    public static class Runner {
        public static void main(String[] args) {
            Student s = new Student();
            Faculty f = new Faculty();

            s.displayStudent();
            f.displayFaculty();
        }
    }

    public static class Student {
        public void displayStudent() {
            System.out.println("Student Name: Rahul");
            System.out.println("Roll Number: 101");
        }
    }
}