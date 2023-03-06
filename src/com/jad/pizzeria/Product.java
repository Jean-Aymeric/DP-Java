package com.jad.pizzeria;

public abstract class Product {
    private final String name;

    private final String product;

    protected Product(final String product, final String name) {
        this.product = product;
        this.name = name;
    }

    public final String getName() {
        return this.product + " " + this.name;
    }

    @Override
    public final String toString() {
        return this.getName();
    }

    public String getProduct() {
        return this.product;
    }
}
