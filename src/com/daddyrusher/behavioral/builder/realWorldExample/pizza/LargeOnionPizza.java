package com.daddyrusher.behavioral.builder.realWorldExample.pizza;

public class LargeOnionPizza extends VegPizza {
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return "Onion pizza";
    }

    @Override
    public String size() {
        return "Large pizza";
    }
}
