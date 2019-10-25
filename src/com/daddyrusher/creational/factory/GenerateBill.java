package com.daddyrusher.creational.factory;

import com.daddyrusher.creational.factory.entity.Plan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlanFactory factory = new GetPlanFactory();

        //read input stream from console
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the name of plan for which the bill will be generated");
            EPlanType planType = EPlanType.getTypeByName(reader.readLine());

            System.out.println("Enter the number of units for bill will be calculated");
            int units = Integer.parseInt(reader.readLine());

            Plan plan = factory.getPlan(planType);
            System.out.print("Bill amount for " + planType.name() + " of " + units + " units is ");
            plan.getRate();
            plan.calculateBill(units);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
