package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class ExtraLargeCheesePizza extends VegPizza {
    @Override
    public float price() {
        return 300.0f;
    }

    @Override
    public String name() {
        return "Cheese pizza";
    }

    @Override
    public String size() {
        return "Extra large size";
    }
}
