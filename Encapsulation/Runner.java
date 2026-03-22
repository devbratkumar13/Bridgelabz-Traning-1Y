package com.gla.Encapsulation;
public class Runner {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(1, "Rahul", 50000);
        Employee emp2 = new PartTimeEmployee(2, "Amit", 0, 5, 500);

        ((Department) emp1).assignDepartment("IT");
        ((Department) emp2).assignDepartment("Support");

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());

            ((Department) emp).getDepartmentDetails();

            System.out.println("----------------------");
        }
    }
}