package com.jad.product.operation.simple;

import com.jad.product.IProduct;
import com.jad.product.composite.CompositeProduct;
import com.jad.product.operation.Operation;

public abstract class SimpleOperation extends Operation {
    protected SimpleOperation(final String name) {
        super(name);
    }

   public IProduct execute(final IProduct product) {
        CompositeProduct result = new CompositeProduct(product.getName(), product.getHeight(), product.getWidth(), product.getDescription());
        for (int column = 0; column < product.getWidth(); column++) {
            for (int row = 0; row < product.getHeight(); row++) {
                if (this.isApplicable(product, row, column)) {
                    result.setPixel(row, column, this.getPixelTransformation(product.getPixel(row, column)));
                } else {
                    result.setPixel(row, column, product.getPixel(row, column));
                }
            }
        }
        result.setDescription(product.getDescription() + ", " + this.getName());
        return result;
    }

    protected abstract boolean isApplicable(final IProduct product, final int row, final int column);

    protected abstract char getPixelTransformation(final char pixel);
}
