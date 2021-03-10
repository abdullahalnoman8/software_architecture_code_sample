package com.softwaredesignpatterns.chain_of_responsibility.exmpl_1;

public class VicePresident extends LoanApprover{

    @Override
    public void approveLoan(Loan loan) {
        System.out.println("Loan amount of " + loan.getAmount() + " approved by the vice president.");
    }
}
