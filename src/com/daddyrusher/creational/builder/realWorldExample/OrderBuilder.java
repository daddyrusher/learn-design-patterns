package com.daddyrusher.creational.builder.realWorldExample;

import com.daddyrusher.creational.builder.realWorldExample.drinks.*;
import com.daddyrusher.creational.builder.realWorldExample.pizza.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderBuilder {
    public OrderedItems preparePizza() throws IOException {
        OrderedItems items = new OrderedItems();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the choice of pizza: ");
        System.out.println("===========================");
        System.out.println("       1. Veg-Pizza        ");
        System.out.println("       2. Non-Veg Pizza    ");
        System.out.println("       3. Exit             ");
        System.out.println("===========================");

        int pizzaAndColdDrinkChoice = Integer.parseInt(reader.readLine());
        switch (pizzaAndColdDrinkChoice) {
            case 1: {
                System.out.println("You ordered Veg Pizza");
                System.out.println("\n\n");
                System.out.println("---------------------");
                System.out.println("1. Cheese Pizza");
                System.out.println("2. Onion Pizza");
                System.out.println("3. Masala Pizza");
                System.out.println("4. Exit");
                System.out.println("---------------------");

                int vegPizzaChoice = Integer.parseInt(reader.readLine());
                switch (vegPizzaChoice) {
                    case 1: {
                        System.out.println("You ordered Cheese Pizza");
                        System.out.println("\n\n");
                        System.out.println("---------------------");
                        System.out.println("1. Small Cheese Pizza");
                        System.out.println("2. Medium Cheese Pizza");
                        System.out.println("3. Large Cheese Pizza");
                        System.out.println("4. Extra Large Cheese Pizza");
                        System.out.println("---------------------");

                        int cheesePizzaSize = Integer.parseInt(reader.readLine());
                        switch (cheesePizzaSize) {
                            case 1: {
                                items.addItem(new SmallCheesePizza());
                                break;
                            }
                            case 2: {
                                items.addItem(new MediumCheesePizza());
                                break;
                            }
                            case 3: {
                                items.addItem(new LargeCheesePizza());
                                break;
                            }
                            case 4: {
                                items.addItem(new ExtraLargeCheesePizza());
                                break;
                            }
                        }
                    }
                    case 2: {
                        System.out.println("You ordered Onion Pizza");
                        System.out.println("\n\n");
                        System.out.println("---------------------");
                        System.out.println("1. Small Onion Pizza");
                        System.out.println("2. Medium Onion Pizza");
                        System.out.println("3. Large Onion Pizza");
                        System.out.println("4. Extra Large Onion Pizza");
                        System.out.println("---------------------");

                        int onionPizzaSize = Integer.parseInt(reader.readLine());
                        switch (onionPizzaSize) {
                            case 1: {
                                items.addItem(new SmallOnionPizza());
                                break;
                            }
                            case 2: {
                                items.addItem(new MediumOnionPizza());
                                break;
                            }
                            case 3: {
                                items.addItem(new LargeOnionPizza());
                                break;
                            }
                            case 4: {
                                items.addItem(new ExtraLargeOnionPizza());
                                break;
                            }
                        }
                    }
                    case 3: {
                        System.out.println("You ordered Masala Pizza");
                        System.out.println("\n\n");
                        System.out.println("---------------------");
                        System.out.println("1. Small Masala Pizza");
                        System.out.println("2. Medium Masala Pizza");
                        System.out.println("3. Large Masala Pizza");
                        System.out.println("4. Extra Large Masala Pizza");
                        System.out.println("---------------------");

                        int masalaPizzaSize = Integer.parseInt(reader.readLine());
                        switch (masalaPizzaSize) {
                            case 1: {
                                items.addItem(new SmallMasalaPizza());
                                break;
                            }
                            case 2: {
                                items.addItem(new MediumMasalaPizza());
                                break;
                            }
                            case 3: {
                                items.addItem(new LargeMasalaPizza());
                                break;
                            }
                            case 4: {
                                items.addItem(new ExtraLargeMasalaPizza());
                                break;
                            }
                        }
                    }
                }
                break;
            }

            case 2: {
                System.out.println("You ordered Non-Veg Pizza");
                System.out.println("\n\n");
                System.out.println("---------------------");
                System.out.println("1. Small Non-Veg Pizza");
                System.out.println("2. Medium Non-Veg Pizza");
                System.out.println("3. Large Non-Veg Pizza");
                System.out.println("4. Extra Non-Veg Pizza");
                System.out.println("---------------------");

                int nonVegPizzaSize = Integer.parseInt(reader.readLine());
                switch (nonVegPizzaSize) {
                    case 1:
                        items.addItem(new SmallNonVegPizza());
                        break;
                    case 2:
                        items.addItem(new MediumNonVegPizza());
                        break;
                    case 3:
                        items.addItem(new LargeNonVegPizza());
                        break;
                    case 4:
                        items.addItem(new ExtraLargeNonVegPizza());
                        break;
                }
            }
            break;
            default: {
                break;
            }
        }

        System.out.println("Enter the choide of ColdDrink");
        System.out.println("---------------------");
        System.out.println("1. Pepsi");
        System.out.println("2. Coke");
        System.out.println("3. Exit");
        System.out.println("---------------------");

        int coldDrinkChoice = Integer.parseInt(reader.readLine());
        switch (coldDrinkChoice) {
            case 1: {
                System.out.println("You ordered Pepsi");
                System.out.println("Enter the Pepsi size");
                System.out.println("---------------------");
                System.out.println("1. Small Pepsi");
                System.out.println("2. Medium Pepsi");
                System.out.println("3. Large Pepsi");
                System.out.println("---------------------");

                int pepsiSize = Integer.parseInt(reader.readLine());
                switch (pepsiSize) {
                    case 1:
                        items.addItem(new SmallPepsi());
                        break;
                    case 2:
                        items.addItem(new MediumPepsi());
                        break;
                    case 3:
                        items.addItem(new LargePepsi());
                        break;
                }
            }
            break;
            case 2: {
                System.out.println("You ordered Coke");
                System.out.println("Enter the Coke size");
                System.out.println("---------------------");
                System.out.println("1. Small Coke");
                System.out.println("2. Medium Coke");
                System.out.println("3. Large Coke");
                System.out.println("---------------------");

                int cokeSize = Integer.parseInt(reader.readLine());
                switch (cokeSize) {
                    case 1:
                        items.addItem(new SmallCoke());
                        break;
                    case 2:
                        items.addItem(new MediumCoke());
                        break;
                    case 3:
                        items.addItem(new LargeCoke());
                        break;
                }
            }
            break;
            default: {
                break;
            }
        }
        return items;
    }
}
