package com.jad.composite;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CompositeProduct extends Product implements ICompositeProduct {
    private final ArrayList<IProduct> subProducts = new ArrayList<>();

    public CompositeProduct(final String name) {
        super(name);
    }

    @Override
    protected final String toStringExtended() {
        return this.subProducts.stream().map(IProduct::toString).collect(Collectors.joining(", ", "(", ")"));
    }

    @Override
    public final void addProduct(IProduct product) {
        this.subProducts.add(product);
    }

    @Override
    public final void removeProduct(IProduct product) {
        this.subProducts.remove(product);
    }
}
