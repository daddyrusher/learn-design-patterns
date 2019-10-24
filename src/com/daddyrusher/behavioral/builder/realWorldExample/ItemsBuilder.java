package com.daddyrusher.behavioral.builder.realWorldExample;

import java.io.IOException;

public class ItemsBuilder {
    public static void main(String[] args) throws IOException {
        OrderBuilder orderBuilder = new OrderBuilder();
        OrderedItems orderedItems = orderBuilder.preparePizza();
        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total cost: " + orderedItems.getCost());
    }
}
