package com.daddyrusher.creational.abstract_factory;

import com.daddyrusher.creational.abstract_factory.enums.EBankType;
import com.daddyrusher.creational.abstract_factory.enums.ELoanType;
import com.daddyrusher.creational.abstract_factory.factory.AbstractFactory;
import com.daddyrusher.creational.abstract_factory.factory.FactoryCreator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the name of Bank from where you want to take loan amount: ");
            EBankType bankType = EBankType.getBankByName(reader.readLine());

            System.out.println("\n");
            System.out.println("Enter the type of loan e.g home or business or education loan: ");
            ELoanType loanType = ELoanType.getLoanByName(reader.readLine());

            AbstractFactory factory = FactoryCreator.getFactory("Bank");
            Bank bank = factory.getBank(bankType);

            System.out.println("\n");
            System.out.println("Enter the interest rate for " + bank.getBankName() + ": ");

            double rate = Double.parseDouble(reader.readLine());
            System.out.println("\n");
            System.out.println("Enter the loan amount you want to take: ");

            double amount = Double.parseDouble(reader.readLine());
            System.out.println("\n");
            System.out.println("Enter the number of years to pay your entire loan amount: ");
            int years = Integer.parseInt(reader.readLine());

            System.out.println("\n");
            System.out.println("you are taking the loan from " + bank.getBankName());

            AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
            Loan loan = loanFactory.getLoan(loanType);
            loan.getInterestRate(rate);
            loan.calculateLoanPayment(amount, years);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
