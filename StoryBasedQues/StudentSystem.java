package com.gla.StoryBasedQues;

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(int rollNo, String name, int marks, String branch) {
        super(rollNo, name, marks);
        this.branch = branch;
        this.name = this.name + " - " + branch;
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Student s1 = new Student(15, "Deepak", 89);
        Student s2 = new EngineeringStudent(2, "Neha", 91, "CSE");

        System.out.println(s1.name + " Grade: " + s1.calculateGrade());
        System.out.println(s2.name + " Grade: " + s2.calculateGrade());
    }
}
