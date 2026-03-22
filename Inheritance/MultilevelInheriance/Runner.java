package com.gla.Inheritance.MultilevelInheriance;

public class Runner {
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming", 40, "PW", true, 5000, 20
        );

        course.displayDetails();
    }
}
