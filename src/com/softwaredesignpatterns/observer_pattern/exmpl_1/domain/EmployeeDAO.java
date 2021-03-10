package com.softwaredesignpatterns.observer_pattern.exmpl_1.domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    Employee employee1 = new Employee("Mike", null, 10000, false);
    Employee employee2 = new Employee("Joe", null, 50000, false);
    Employee employee3 = new Employee("pate", null, 6000, false);
    Employee employee4 = new Employee("April", null, 8000, false);
    Employee employee5 = new Employee("Steve", null, 5000, false);

    List<Employee> employees;

    public List<Employee> generateEmployee() {

        employees = new ArrayList<Employee>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        return employees;
    }
    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    public void showEmployee(){
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
