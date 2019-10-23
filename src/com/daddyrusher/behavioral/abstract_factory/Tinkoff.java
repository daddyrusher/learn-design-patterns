package com.daddyrusher.behavioral.abstract_factory;

public class Tinkoff implements Bank {
    private final String bankName;

    public Tinkoff() {
        this.bankName = "Tinkoff";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
