package com.softwaredesignpatterns.observer_pattern.exmpl_1.domain;

import java.util.Date;

public class Employee {
    private String name;
    private int employeeID;
    private Date hireDate;
    private int salary;
    private boolean working = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, boolean working) {
        super();
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.working = working;

        this.employeeID = ++COUNTER;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", employeeID=" + employeeID
                + ", hireDate=" + hireDate + ", salary=" + salary
                + ", working=" + working + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}
