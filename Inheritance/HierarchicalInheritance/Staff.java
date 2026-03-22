package com.gla.Inheritance.HierarchicalInheritance;

class Staff extends Person {
    private String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public void displayRole() {
        System.out.println("Staff: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
