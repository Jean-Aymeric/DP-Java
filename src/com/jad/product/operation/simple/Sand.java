package com.jad.product.operation.simple;

import com.jad.product.IProduct;
import com.jad.product.Product;

public class Sand extends SimpleOperation {
    public Sand() {
        super("poncé");
    }

    @Override
    protected boolean isApplicable(final IProduct product, final int row, final int column) {
        return product.getPixel(row, column) != Product.EmptyPixel;
    }

    @Override
    protected char getPixelTransformation(final char pixel) {
        return Character.toLowerCase(pixel);
    }
}
