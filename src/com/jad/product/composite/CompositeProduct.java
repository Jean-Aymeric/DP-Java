package com.jad.product.composite;

import com.jad.interpreter.RecipeExpression;
import com.jad.product.Product;

public abstract class CompositeProduct extends Product {
    public CompositeProduct(final String name, final RecipeExpression recipe) {
        super(name, recipe);
    }
}
