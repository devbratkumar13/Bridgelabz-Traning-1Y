package com.gla.Inheritance.HierarchicalInheritance;

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Teacher: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}