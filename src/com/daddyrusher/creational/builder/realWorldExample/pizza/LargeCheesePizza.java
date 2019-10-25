package com.daddyrusher.creational.builder.realWorldExample.pizza;

public class LargeCheesePizza extends VegPizza {
    @Override
    public float price() {
        return 260.0f;
    }

    @Override
    public String name() {
        return "Cheese pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
