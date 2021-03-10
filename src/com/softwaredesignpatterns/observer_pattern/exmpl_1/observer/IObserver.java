package com.softwaredesignpatterns.observer_pattern.exmpl_1.observer;

import com.softwaredesignpatterns.observer_pattern.exmpl_1.domain.Employee;

public interface IObserver {
    public void callMe(Employee employee, String msg);
}
