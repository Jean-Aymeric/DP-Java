package com.jad.interpreter;

import com.jad.product.IProduct;

public class RecipeContext {
    private IProduct product;

    public RecipeContext(final IProduct product) {
        this.product = product;
    }

    public RecipeContext() {
        this(null);
    }

    public IProduct getProduct() {
        return product;
    }

    public void setProduct(final IProduct product) {
        this.product = product;
    }
}
