package com.daddyrusher.structural.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {

    @Override
    public void giveBankDetails() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name: ");
            String customerName = reader.readLine();
            System.out.println("\n");

            System.out.println("Enter the account number: ");
            long accNumber = Long.parseLong(reader.readLine());
            System.out.println("\n");

            System.out.println("Enter the bank name: ");
            String bankName = reader.readLine();

            setAccHolderName(customerName);
            setAccNumber(accNumber);
            setBankName(bankName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNumber = getAccNumber();
        String accHolderName = getAccHolderName();
        String bankName = getBankName();
        return "The account number " + accNumber + " of " + accHolderName + " in " + bankName + " bank is valid and authenticated for issuing the credit card.";
    }
}
