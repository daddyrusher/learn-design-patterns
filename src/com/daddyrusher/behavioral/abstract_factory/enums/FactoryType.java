package com.daddyrusher.behavioral.abstract_factory.enums;

public enum FactoryType {
    BANK, LOAN;

    public static FactoryType getTypeByName(String name) {
        return FactoryType.valueOf(name.toUpperCase());
    }
}
