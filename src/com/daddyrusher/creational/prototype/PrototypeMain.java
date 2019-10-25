package com.daddyrusher.creational.prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter employee id: ");
        int eid = Integer.parseInt(reader.readLine());
        System.out.println("\n");

        System.out.println("Enter Employee name: ");
        String eName = reader.readLine();
        System.out.println("\n");

        System.out.println("Enter employee designation: ");
        String eDesignation = reader.readLine();
        System.out.println("\n");

        System.out.println("Enter employee address: ");
        String eAddress = reader.readLine();
        System.out.println("\n");

        System.out.println("Enter employee salary: ");
        Double eSalary = Double.parseDouble(reader.readLine());
        System.out.println("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, eName, eDesignation, eSalary, eAddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
