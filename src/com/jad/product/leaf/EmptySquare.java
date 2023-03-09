package com.jad.product.leaf;

import com.jad.product.Product;

public class EmptySquare extends LeafProduct {
    public EmptySquare(final char color) {
        super("Carré vide", color);
    }

    public EmptySquare() {
        this(Product.EmptyPixel);
    }

    @Override
    protected void buildImage(final char color) {
        for (int column = 0; column < getWidth(); column++) {
            for (int row = 0; row < getHeight(); row++) {
                if ((column == 0) || (column == getWidth() - 1) || (row == 0) || (row == getHeight() - 1)) {
                    this.setPixel(row, column, color);
                } else {
                    this.setPixel(row, column, Product.EmptyPixel);
                }
            }
        }

    }
}

