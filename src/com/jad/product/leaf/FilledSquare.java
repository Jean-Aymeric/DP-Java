package com.jad.product.leaf;

import com.jad.product.Product;

public class FilledSquare extends LeafProduct {
    public FilledSquare(final char color) {
        super("Carré rempli", color);
    }

    public FilledSquare() {
        this(Product.EmptyPixel);
    }

    @Override
    protected void buildImage(final char color) {
        for (int column = 0; column < getWidth(); column++) {
            for (int row = 0; row < getWidth(); row++) {
                this.setPixel(row, column, color);
            }
        }
    }
}
