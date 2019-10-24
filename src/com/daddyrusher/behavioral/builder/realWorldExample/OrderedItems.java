package com.daddyrusher.behavioral.builder.realWorldExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class OrderedItems {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        AtomicReference<Float> cost = new AtomicReference<>(0.0f);
        items.forEach(item -> cost.updateAndGet(v -> (float) (v + item.price())));
        return cost.get();
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.println("Item is: " + item.name());
            System.out.println("Size is: " + item.size());
            System.out.println("Price is " + item.price());
        });
    }
}
