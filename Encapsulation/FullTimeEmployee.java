package com.gla.Encapsulation;
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    double calculateSalary() {
        return getBaseSalary();
    }

    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    public void getDepartmentDetails() {
        System.out.println("Department: " + department);
    }
}
