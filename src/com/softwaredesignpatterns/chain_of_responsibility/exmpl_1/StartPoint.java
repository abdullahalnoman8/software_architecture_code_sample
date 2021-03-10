package com.softwaredesignpatterns.chain_of_responsibility.exmpl_1;

public class StartPoint {
    public static void main(String[] args) {
        LoanApprover approver = new Manager();
        LoanApprover approver1 = new Director();
        LoanApprover approver2 = new VicePresident();

        approver.setNextLoanApprover(approver1);
        approver1.setNextLoanApprover(approver2);

        approver.approveLoan(new Loan(50000)); // approved by the manager.
        approver.approveLoan(new Loan(200000)); // approved by the director.
        approver.approveLoan(new Loan(500000)); // approved by the vice president.
    }


}

