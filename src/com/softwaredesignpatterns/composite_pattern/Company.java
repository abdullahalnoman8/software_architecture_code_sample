package com.softwaredesignpatterns.composite_pattern;

public class Company {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Lokesh Sharma",54335, "Pro Developer");
        Developer developer2 = new Developer("Vinay Sharma",543, "Developer");

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(developer1);
        companyDirectory.addEmployee(developer2);

        Manager man1 = new Manager("Kushagra Garg",535, "SEO Manager");
        Manager man2 = new Manager("Vikram Sharma ",676, "Kushagra's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(companyDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
