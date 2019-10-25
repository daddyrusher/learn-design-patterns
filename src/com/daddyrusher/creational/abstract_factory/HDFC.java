package com.daddyrusher.creational.abstract_factory;

public class HDFC implements Bank {
    private final String bankName;

    public HDFC() {
        this.bankName = "HDFC BANK";
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
