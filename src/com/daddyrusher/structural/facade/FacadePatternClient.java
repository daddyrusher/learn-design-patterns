package com.daddyrusher.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int choice;

    public static void main(String[] args) throws IOException {
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("=========Mobile shop ==========");
            System.out.println("1. iPhone");
            System.out.println("2. Samsung");
            System.out.println("3. Blackberry");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");

            choice = Integer.parseInt(reader.readLine());
            ShopKeeper shopKeeper = new ShopKeeper();

            switch (choice) {
                case 1:
                    shopKeeper.iphoneSale();
                    break;
                case 2:
                    shopKeeper.samsungSale();
                    break;
                case 3:
                    shopKeeper.blackberrySale();
                    break;
                default:
                    System.out.println("Nothing you purchased");
                return;
            }
        } while (choice != 4);
    }
}
