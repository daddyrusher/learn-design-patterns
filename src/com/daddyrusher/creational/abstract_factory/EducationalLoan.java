package com.daddyrusher.creational.abstract_factory;

public class EducationalLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
