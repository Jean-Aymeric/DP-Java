package com.jad.heating;

public class Heating {
    private final String name;
    private final HeatingType type;

    public Heating(final String name, final HeatingType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public HeatingType getType() {
        return this.type;
    }
}
