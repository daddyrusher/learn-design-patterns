package com.daddyrusher.behavioral.abstract_factory.enums;

public enum EBankType {
    HDFC, SBERBANK, TINKOFF;

    public static EBankType getBankByName(String bankName) {
        if (bankName == null || bankName.isEmpty()) {
            throw new IllegalArgumentException("Bank name is empty or null!");
        }
        return EBankType.valueOf(bankName.toUpperCase());
    }
}
