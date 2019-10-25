package com.daddyrusher.creational.builder.example;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packs) {
        items.add(packs);
    }
    public void getCost() {
        items.forEach(Packing::price);
    }
    public void showItems() {
        items.forEach(item -> {
            System.out.println("CD name: " + item.pack());
            System.out.println("CD price: " + item.price());
        });
    }
}
