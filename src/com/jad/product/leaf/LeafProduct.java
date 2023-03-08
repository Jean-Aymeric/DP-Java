package com.jad.product.leaf;

import com.jad.product.Product;

public abstract class LeafProduct extends Product {
    protected LeafProduct(final String name, final char color) {
        super(name, 4, 4, name + " de couleur " + color);
        this.buildImage(color);
    }

    protected abstract void buildImage(final char color);
}
