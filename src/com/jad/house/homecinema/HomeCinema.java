package com.jad.house.homecinema;

public class HomeCinema {
    private final String name;
    private int volume = 0;
    private boolean on = false;

    public HomeCinema(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(final int volume) {
        this.volume = volume;
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
