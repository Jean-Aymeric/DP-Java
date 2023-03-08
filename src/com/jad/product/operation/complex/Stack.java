package com.jad.product.operation.complex;

import com.jad.product.IProduct;
import com.jad.product.Product;
import com.jad.product.composite.CompositeProduct;

import java.util.Arrays;
import java.util.ListIterator;

public class Stack extends ComplexOperation{
    public Stack() {
        super("Empilé");
    }

    @Override
    protected boolean isApplicable(final int row, final int column, final IProduct... products) {
        for(IProduct product : products) {
            if(product.getPixel(row, column) != Product.EmptyPixel) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected char getPixelTransformation(final int row, final int column, final IProduct... products) {
        ListIterator<IProduct> productIterator = Arrays.stream(products).toList().listIterator(products.length);
        while(productIterator.hasPrevious()) {
            IProduct product = productIterator.previous();
            if(product.getPixel(row, column) != Product.EmptyPixel) {
                return product.getPixel(row, column);
            }
        }
        return Product.EmptyPixel;
    }

    @Override
    protected void setNewProductSize(CompositeProduct result, final IProduct... products) {
        int maxHeight = 0;
        int maxWidth = 0;
        for(IProduct product : products) {
            maxHeight = Math.max(maxHeight, product.getHeight());
            maxWidth = Math.max(maxWidth, product.getWidth());
        }
        result.setHeight(maxHeight);
        result.setWidth(maxWidth);
    }
}
