package com.jad.product.operation.complex;

import com.jad.product.IProduct;
import com.jad.product.Product;

public class StickLeftToRight extends ComplexOperation{
    public StickLeftToRight() {
        super("Collé de gauche à droite");
    }

    @Override
    protected boolean isApplicable(final int row, final int column, final IProduct... products) {
        return true;
    }

    @Override
    protected char getPixelTransformation(final int row, final int column, final IProduct... products) {
        int actualWidth = 0;
        for(IProduct product : products) {
            if(column < actualWidth + product.getWidth()) {
                return product.getPixel(row, column -actualWidth);
            }
            actualWidth += product.getWidth();
        }
        return Product.EmptyPixel;
    }

    @Override
    protected void setNewProductSize(IProduct result, final IProduct... products) {
        int newHeight = 0;
        int newWidth = 0;
        for(IProduct product : products) {
            newHeight = Math.max(newHeight, product.getHeight());
            newWidth += product.getWidth();
        }
        result.setHeight(newHeight);
        result.setWidth(newWidth);
    }
}
