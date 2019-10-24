package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class SmallCheesePizza extends VegPizza {
    @Override
    public float price() {
        return 170.0f;
    }

    @Override
    public String name() {
        return "Cheese pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
