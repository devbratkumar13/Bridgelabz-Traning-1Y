package com.gla.Constructor.Level_1;
import java.util.Scanner;
class employee {
    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        employee e = new employee();
        e.name = in.nextLine();
        e.id = in.nextInt();
        e.salary = in.nextInt();
        e.displayDetails();
    }
}