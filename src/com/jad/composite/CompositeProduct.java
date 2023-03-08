package com.jad.composite;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CompositeProduct extends Product {
    private final ArrayList<IProduct> subProducts = new ArrayList<>();

    public CompositeProduct(final String name) {
        super(name);
    }

    @Override
    protected final String toStringExtended() {
        return this.subProducts.stream().map(IProduct::toString).collect(Collectors.joining(", ", "(", ")"));
    }

    public final void addProduct(IProduct product) {
        this.subProducts.add(product);
    }

    public final void removeProduct(IProduct product) {
        this.subProducts.remove(product);
    }

    @Override
    public ProductsIterable getProductsIterable() {
        ProductsIterable productsIterable = new ProductsIterable(this);
        for (IProduct product : this.subProducts) {
            productsIterable.addAll(product.getProductsIterable());
        }
        return productsIterable;
    }
}
