package com.softwaredesignpatterns.observer_pattern.exmpl_1.observer;

import com.softwaredesignpatterns.observer_pattern.exmpl_1.domain.Employee;

public class HRDepartment implements IObserver{
    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("HR Department is notified..");
        System.out.println(msg+  " : "+employee.getName());

    }
}
