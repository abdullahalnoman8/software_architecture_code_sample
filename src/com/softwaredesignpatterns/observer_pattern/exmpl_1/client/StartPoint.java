package com.softwaredesignpatterns.observer_pattern.exmpl_1.client;

import com.softwaredesignpatterns.observer_pattern.exmpl_1.EmployeeManagementSystem;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.domain.Employee;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.domain.EmployeeDAO;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.observer.HRDepartment;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.observer.IObserver;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.observer.PayrollDepartment;

import java.util.Date;

public class StartPoint {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.generateEmployee();
        employeeDAO.showEmployee();
        System.out.println();

        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        //ems.removeObserver(payroll);

        ems.registerObserver(hrSystem);
//          ems.removeObserver(hrSystem);

        Employee employee = new Employee("Bob",new Date(), 10000, false);
        ems.hireNewEmployee(employee);

        System.out.println();
        ems.modifyEmployeeData(6, "Oliver");

        System.out.println("\n");

//          ems.notifyObserver();
    }
}
