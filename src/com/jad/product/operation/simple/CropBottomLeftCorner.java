package com.jad.product.operation.simple;

import com.jad.product.IProduct;
import com.jad.product.Product;

public class CropBottomLeftCorner extends SimpleOperation {
    public CropBottomLeftCorner() {
        super("coin bas gauche coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return (column < 2) && (row >= product.getHeight()-2);
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}
