package com.gla.Inheritance.HierarchicalInheritance;

public class Runner {
    public static void main(String[] args) {

        Teacher t = new Teacher("Rahul", 35, "Math");
        Student s = new Student("Amit", 18, "12th");
        Staff st = new Staff("Ramesh", 40, "Clerk");

        t.displayRole();
        System.out.println("----------------");
        s.displayRole();
        System.out.println("----------------");
        st.displayRole();
    }
}