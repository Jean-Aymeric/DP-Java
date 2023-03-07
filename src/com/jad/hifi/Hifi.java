package com.jad.hifi;

public class Hifi {
    private final String name;
    private int volume = 0;

    public Hifi(final String name) {
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
}
