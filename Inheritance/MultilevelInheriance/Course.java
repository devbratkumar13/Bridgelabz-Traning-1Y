package com.gla.Inheritance.MultilevelInheriance;
class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
