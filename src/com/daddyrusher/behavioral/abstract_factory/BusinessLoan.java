package com.daddyrusher.behavioral.abstract_factory;

public class BusinessLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
