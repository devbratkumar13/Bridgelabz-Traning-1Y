package com.gla.Inheritance.HierarchicalInheritance;

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}