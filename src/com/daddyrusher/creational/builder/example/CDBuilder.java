package com.daddyrusher.creational.builder.example;

public class CDBuilder {
    public CDType buildSonyCD() {
        CDType type = new CDType();
        type.addItem(new Sony());
        return type;
    }
    public CDType buildSamsungCD() {
        CDType type = new CDType();
        type.addItem(new Samsung());
        return type;
    }
}
