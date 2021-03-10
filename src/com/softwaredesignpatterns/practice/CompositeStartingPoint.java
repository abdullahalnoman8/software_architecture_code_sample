package com.softwaredesignpatterns.practice;

public class CompositeStartingPoint {
    public static void main(String[] args) {
        Developer developer = new Developer("Abdullah","PorthStrasse",3453453.0);
        Developer developer1 = new Developer("Pauls","PorthStrasse",345345.0);

        Manager manager = new Manager("Sayeem","PorthStrasse",23423.0);
        Manager manager1 = new Manager("Riyad","PorthStrasse",234423.0);


        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(developer);
        devDirectory.addEmployee(developer1);
        devDirectory.showEmployeeDetails();
        System.out.println();


        CompanyDirectory manDirectory = new CompanyDirectory();
        manDirectory.addEmployee(manager);
        manDirectory.addEmployee(manager1);
        manDirectory.showEmployeeDetails();
        System.out.println();

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(devDirectory);
        companyDirectory.addEmployee(manDirectory);
        companyDirectory.showEmployeeDetails();
    }
}
