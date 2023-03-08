package com.jad.product.leaf;

import com.jad.product.Product;

public class EmptySquare extends LeafProduct {
    public EmptySquare(final char color) {
        super("Carré vide", color);
    }

    @Override
    protected void buildImage(final char color) {
        for (int column = 0; column < getHeight(); column++) {
            for (int row = 0; row < getWidth(); row++) {
                if ((column == 0) || (column == getHeight() - 1) || (row == 0) || (row == getWidth() - 1)) {
                    this.setPixel(row, column, color);
                } else {
                    this.setPixel(row, column, Product.EmptyPixel);
                }
            }
        }

    }
}

