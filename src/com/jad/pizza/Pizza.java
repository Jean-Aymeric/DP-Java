package com.jad.pizza;

public abstract class Pizza {
    private final String name;

    protected Pizza(final String name) {
        this.name = "Pizza " + name;
    }

    public final String getName() {
        return name;
    }

    @Override
    public final String toString() {
        return this.getName();
    }
}
