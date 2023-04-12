package com.bridgelabz.io;

public class EmployeePayRoll {
    int id;
    String name;
    int salary;

    public EmployeePayRoll(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayRoll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
