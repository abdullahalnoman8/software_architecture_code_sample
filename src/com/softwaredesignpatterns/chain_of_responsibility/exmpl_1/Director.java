package com.softwaredesignpatterns.chain_of_responsibility.exmpl_1;

public class Director extends LoanApprover{
    @Override
    public void approveLoan(Loan loan) {
        if(loan.getAmount() <=250000){
            System.out.println("Loan amount of " + loan.getAmount() + " approved by the Director.");
        }else{
            nextLoanApprover.approveLoan(loan);
        }
    }
}
