package com.daddyrusher.behavioral.abstract_factory;

public class Sberbank implements Bank {
    private final String bankName;

    public Sberbank() {
        this.bankName = "Sberbank";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
