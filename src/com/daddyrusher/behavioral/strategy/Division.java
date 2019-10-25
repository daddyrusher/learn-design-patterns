package com.daddyrusher.behavioral.strategy;

public class Division implements Strategy {
    @Override
    public float calculation(float a, float b) {
        return a / b;
    }
}
