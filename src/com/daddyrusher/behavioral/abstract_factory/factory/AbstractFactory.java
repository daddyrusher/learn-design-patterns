package com.daddyrusher.behavioral.abstract_factory.factory;

import com.daddyrusher.behavioral.abstract_factory.Bank;
import com.daddyrusher.behavioral.abstract_factory.Loan;
import com.daddyrusher.behavioral.abstract_factory.enums.EBankType;
import com.daddyrusher.behavioral.abstract_factory.enums.ELoanType;
import com.daddyrusher.behavioral.factory.EPlanType;

public abstract class AbstractFactory {
    public abstract Bank getBank(EBankType bankName);
    public abstract Loan getLoan(ELoanType loanName);
}
