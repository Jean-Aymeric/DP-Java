package com.jad.product.operation.complex;

import com.jad.product.IProduct;
import com.jad.product.composite.CompositeProduct;
import com.jad.product.operation.Operation;

public abstract class ComplexOperation extends Operation {
    protected ComplexOperation(final String name) {
        super(name);
    }

    public IProduct execute(final IProduct... products) {
        CompositeProduct result = new CompositeProduct("", 0, 0, "");
        StringBuilder description = new StringBuilder();
        for(IProduct product : products) {
            description.append(product.getDescription()).append(", ");
        }
        result.setDescription(description + ", " + this.getName());
        return result;
    }

    protected abstract boolean isApplicable(final IProduct product, final int row, final int column);

    protected abstract char getPixelTransformation(final char pixel);
}
