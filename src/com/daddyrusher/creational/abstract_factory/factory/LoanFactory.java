package com.daddyrusher.creational.abstract_factory.factory;

import com.daddyrusher.creational.abstract_factory.*;
import com.daddyrusher.creational.abstract_factory.enums.EBankType;
import com.daddyrusher.creational.abstract_factory.enums.ELoanType;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(EBankType bankName) {
        return null;
    }

    @Override
    public Loan getLoan(ELoanType loanType) {
        if (loanType == null) {
            return null;
        }
        switch (loanType) {
            case HOME:
                return new HomeLoan();
            case BUSINESS:
                return new BusinessLoan();
            case EDUCATION:
                return new EducationalLoan();
        }
        return null;
    }
}
