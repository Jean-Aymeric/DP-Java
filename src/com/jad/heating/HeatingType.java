package com.jad.heating;

public enum HeatingType {
    ELECTRIC("Electrique"),
    GAS("Gaz"),
    SOLAR("Solaire"),
    WOOD("Bois");

    private final String name;

    HeatingType(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static HeatingType getHeatingType(final String name) {
        for (HeatingType heatingType : HeatingType.values()) {
            if (heatingType.getName().equals(name)) {
                return heatingType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
