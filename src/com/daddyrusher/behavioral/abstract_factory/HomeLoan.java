package com.daddyrusher.behavioral.abstract_factory;

public class HomeLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
