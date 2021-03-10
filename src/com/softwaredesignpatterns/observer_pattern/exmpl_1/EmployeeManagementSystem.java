package com.softwaredesignpatterns.observer_pattern.exmpl_1;



import com.softwaredesignpatterns.observer_pattern.exmpl_1.domain.Employee;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.domain.EmployeeDAO;
import com.softwaredesignpatterns.observer_pattern.exmpl_1.observer.IObserver;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManagementSystem {

	private List<IObserver> observers;
	private List<Employee> employees;
	private EmployeeDAO employeeDAO;
	private String msg;
	private Employee employee;

	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployee();
	}

	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
        observers.add(o);
	}


	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		observers.remove(o);

	}

	public void notifyObserver() {
		for (IObserver departments : observers) {
			departments.callMe(employee,msg);
		}
	}
	public void hireNewEmployee(Employee emp){
		employee = emp;
		employees.add(emp);
		msg ="New Hire ";
		notifyObserver();
	}
	public void modifyEmployeeData(int id , String newname){
		boolean notify= false;
		for(Employee emp : employees){
			if(emp.getEmployeeID() == id){
				emp.setName(newname);
				this.employee = emp;
				this.msg = "ID No : "+id +" has been modified";
				notify=true;
			}
		}
		if(notify){
			notifyObserver();
		}
	}

}
