package com.daddyrusher.structural.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomer {
    private static int choice;

    public static void main(String[] args) throws IOException {
        do {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("========= Food menu ========");
            System.out.println("1.Vegetarian food \n");
            System.out.println("2. Non-vegetarian food \n");
            System.out.println("3. Chinese food \n");
            System.out.println("4. Exit \n");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case 1: {
                    VegFood vegFood = new VegFood();
                    System.out.println(vegFood.prepareFood());
                    System.out.println(vegFood.foodPrice());
                }
                break;
                case 2: {
                    Food food = new NonVegFood(new VegFood());
                    System.out.println(food.prepareFood());
                    System.out.println(food.foodPrice());
                }
                break;
                case 3: {
                    Food food = new ChineseFood(new VegFood());
                    System.out.println(food.prepareFood());
                    System.out.println(food.foodPrice());
                }
                break;
                default: {
                    System.out.println("Other than these no food available");
                }
                return;
            }
        } while (choice != 4);
    }
}
