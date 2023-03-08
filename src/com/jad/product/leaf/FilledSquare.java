package com.jad.product.leaf;

public class FilledSquare extends LeafProduct {
    public FilledSquare(final char color) {
        super("Carré rempli", color);
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
