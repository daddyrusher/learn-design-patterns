package com.daddyrusher.behavioral.builder.realWorldExample.drinks;

public class SmallCoke extends Coke {
    @Override
    public String name() {
        return "300 ml coke";
    }

    @Override
    public String size() {
        return "Small size";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
