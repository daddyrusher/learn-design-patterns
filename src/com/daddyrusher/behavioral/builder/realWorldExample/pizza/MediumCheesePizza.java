package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class MediumCheesePizza extends VegPizza {
    @Override
    public float price() {
        return 220.0f;
    }

    @Override
    public String name() {
        return "Cheese pizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
}