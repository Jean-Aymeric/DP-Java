package com.jad.composite;

public abstract class Product implements IProduct {
    private final String name;

    public Product(final String name) {
        this.name = name;
    }

    @Override
    public final String getName() {
        return name;
    }

    @Override
    public final String toString() {
        return this.name + this.toStringExtended();
    }

    protected abstract String toStringExtended();
}
