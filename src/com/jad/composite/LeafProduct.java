package com.jad.composite;

public class LeafProduct extends Product {
    public LeafProduct(final String name) {
        super(name);
    }

    @Override
    protected final String toStringExtended() {
        return "";
    }
}
