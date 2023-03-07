package com.jad.homecinema;

public class HomeCinema {
    private final String name;
    private int volume = 0;

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
}
