package com.softwaredesignpatterns.practice;

public class Manager implements Employee{
    private String name;
    private String address;
    private Double salary;

    public Manager(String name, String address, Double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(getName() + " Salary: " + getSalary());
    }
}
