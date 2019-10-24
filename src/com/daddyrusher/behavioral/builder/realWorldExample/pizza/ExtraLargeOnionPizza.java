package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class ExtraLargeOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 200.0f;
    }

    @Override
    public String name() {
        return "Onion pizza";
    }

    @Override
    public String size() {
        return "Extra large size";
    }
}
