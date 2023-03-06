package com.jad.pizzeria;

public abstract class ProductFactory {
    private final String productNameMade;

    protected ProductFactory(final String productNameMade) {
        this.productNameMade = productNameMade;
    }

    public abstract Product make();

    public final String getProductNameMade() {
        return productNameMade;
    }

    public final boolean isProductNameMade(String productNameMade) {
        return this.productNameMade.equals(productNameMade);
    }
}
