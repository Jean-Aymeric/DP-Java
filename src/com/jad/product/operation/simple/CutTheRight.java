package com.jad.product.operation.simple;

import com.jad.product.IProduct;
import com.jad.product.Product;

public class CutTheRight extends SimpleOperation {
    public CutTheRight() {
        super("droit coupé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return column == (product.getHeight() - 1);
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Product.EmptyPixel;
    }
}
