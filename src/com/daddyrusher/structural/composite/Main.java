package com.daddyrusher.structural.composite;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Cashier(101, "Kek Ivanov", 20000.0);
        Employee employee2 = new Accountant(102, "Lol Kekov", 30000.0);
        Employee employee3 = new Cashier(103, "Sobaka sutulaya", 1000.0);
        Employee manager = new BankManager(100, "Sobaka sutulaya", 1000.0);

        manager.add(employee1);
        manager.add(employee2);
        manager.add(employee3);
        manager.print();
    }
}
