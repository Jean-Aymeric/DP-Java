package com.jad.herd;

public abstract class Cow {
    private final String name;

    protected Cow(final String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void speak();

    public String getName() {
        return name;
    }
}
