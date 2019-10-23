package com.daddyrusher.behavioral.abstract_factory.factory;

import com.daddyrusher.behavioral.abstract_factory.enums.FactoryType;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null || choice.isEmpty()) {
            throw new IllegalArgumentException("Choice is empty or null");
        }

        switch (FactoryType.getTypeByName(choice)) {
            case BANK:
                return new BankFactory();
            case LOAN:
                return new LoanFactory();
        }
        return null;
    }
}
