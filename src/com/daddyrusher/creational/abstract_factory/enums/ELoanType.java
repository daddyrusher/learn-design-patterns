package com.daddyrusher.creational.abstract_factory.enums;

public enum ELoanType {
    HOME, BUSINESS, EDUCATION;

    public static ELoanType getLoanByName(String loanName) {
        if (loanName == null || loanName.isEmpty()) {
            throw new IllegalArgumentException("Loan name is empty or null!");
        }
        return ELoanType.valueOf(loanName.toUpperCase());
    }
}
