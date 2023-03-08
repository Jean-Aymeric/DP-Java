package com.jad.product.operation.complex;

import com.jad.product.IProduct;
import com.jad.product.Product;
import com.jad.product.operation.Operation;

import java.util.Arrays;
import java.util.stream.Collectors;

public abstract class ComplexOperation extends Operation {
    protected ComplexOperation(final String name) {
        super(name);
    }

    public IProduct execute(final IProduct... products) {
        Product result = new Product("", 0, 0, "");
        result.setDescription(this.getName() + Arrays.stream(products).map(IProduct::getDescription).collect(Collectors.joining(", ", "[\n", "\n]")));
        this.setNewProductSize(result, products);
        for (int column = 0; column < result.getWidth(); column++) {
            for (int row = 0; row < result.getHeight(); row++) {
                if (this.isApplicable(row, column, products)) {
                    result.setPixel(row, column, this.getPixelTransformation(row, column, products));
                } else {
                    result.setPixel(row, column, Product.EmptyPixel);
                }
            }
        }
        return result;
    }

    protected abstract boolean isApplicable(final int row, final int column, final IProduct... products);

    protected abstract char getPixelTransformation(final int row, final int column, final IProduct... products);

    protected abstract void setNewProductSize(final IProduct result, final IProduct... products);
}
