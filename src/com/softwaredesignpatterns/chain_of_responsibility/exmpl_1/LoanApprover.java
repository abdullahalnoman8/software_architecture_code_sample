package com.softwaredesignpatterns.chain_of_responsibility.exmpl_1;

public abstract class LoanApprover {

    protected LoanApprover nextLoanApprover;

    // set the next approver
    public void setNextLoanApprover(LoanApprover nextLoanApprover) {
        this.nextLoanApprover = nextLoanApprover;
    }
    // to actually approve loan
    public abstract void approveLoan(Loan loan);
}
