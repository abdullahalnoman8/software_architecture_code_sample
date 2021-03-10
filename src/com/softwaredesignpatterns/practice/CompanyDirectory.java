package com.softwaredesignpatterns.practice;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
    private List<Employee> employeeList = new ArrayList<>();
    private Employee employee;



    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee e : employeeList) {
            e.showEmployeeDetails();
        }
    }
}
