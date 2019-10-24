package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class LargeMasalaPizza extends VegPizza {
    @Override
    public float price() {
        return 150.0f;
    }

    @Override
    public String name() {
        return "Masala pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
