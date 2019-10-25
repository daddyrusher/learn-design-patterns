package com.daddyrusher.creational.abstract_factory.factory;

import com.daddyrusher.creational.abstract_factory.*;
import com.daddyrusher.creational.abstract_factory.enums.EBankType;
import com.daddyrusher.creational.abstract_factory.enums.ELoanType;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(EBankType bankType) {
        if(bankType == null) {
            return null;
        }

        switch (bankType) {
            case HDFC:
                return new HDFC();
            case TINKOFF:
                return new Tinkoff();
            case SBERBANK:
                return new Sberbank();
        }
        return null;
    }

    @Override
    public Loan getLoan(ELoanType loanType) {
        return null;
    }
}
