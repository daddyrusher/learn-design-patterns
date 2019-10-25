package com.daddyrusher.creational.builder.realWorldExample.drinks;

public class LargeCoke extends Coke {
    @Override
    public String name() {
        return "750 ml coke";
    }

    @Override
    public String size() {
        return "Large coke";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
