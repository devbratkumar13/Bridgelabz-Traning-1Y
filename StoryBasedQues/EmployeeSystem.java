package com.gla.StoryBasedQues;

class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {
    String department;

    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Manager(201, "Anita", "HR");

        System.out.println(e1.generateEmail());
        System.out.println(e2.generateEmail());
    }
}