package com.daddyrusher.creational.abstract_factory.factory;

import com.daddyrusher.creational.abstract_factory.Bank;
import com.daddyrusher.creational.abstract_factory.Loan;
import com.daddyrusher.creational.abstract_factory.enums.EBankType;
import com.daddyrusher.creational.abstract_factory.enums.ELoanType;

public abstract class AbstractFactory {
    public abstract Bank getBank(EBankType bankName);
    public abstract Loan getLoan(ELoanType loanName);
}
