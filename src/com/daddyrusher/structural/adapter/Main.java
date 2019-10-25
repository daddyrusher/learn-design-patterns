package com.daddyrusher.structural.adapter;

public class Main {
    public static void main(String[] args) {
        CreditCard targerInterface = new BankCustomer();
        targerInterface.giveBankDetails();
        System.out.println(targerInterface.getCreditCard());
    }
}
