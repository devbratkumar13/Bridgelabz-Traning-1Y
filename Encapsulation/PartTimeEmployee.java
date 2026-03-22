package com.gla.Encapsulation;
class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int id, String name, double baseSalary,
                            int hoursWorked, double hourlyRate) {
        super(id, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
