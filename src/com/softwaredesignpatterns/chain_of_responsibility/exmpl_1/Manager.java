package com.softwaredesignpatterns.chain_of_responsibility.exmpl_1;

public class Manager extends LoanApprover{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() <= 100000){
            System.out.println("Loan amount of " + loan.getAmount() + " approved by the Manager.");
        }else{
            nextLoanApprover.approveLoan(loan);
        }
    }
}
