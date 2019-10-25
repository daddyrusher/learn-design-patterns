package com.daddyrusher.creational.factory;

public enum EPlanType {
    DOMESTICPLAN, COMMERCIALPLAN, INSTITUTIONALPLAN;

    public static EPlanType getTypeByName(String typeName) {
        if (typeName != null && !typeName.isEmpty()) {
            return EPlanType.valueOf(typeName.toUpperCase());
        }
        throw new IllegalArgumentException("type is not valid or empty!");
    }
}
