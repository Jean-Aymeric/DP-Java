package com.jad.house.heating;

public class Heating {
    private final String name;
    private final HeatingType type;
    private boolean on = false;

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

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public boolean isOff() {
        return ! this.on;
    }
}
