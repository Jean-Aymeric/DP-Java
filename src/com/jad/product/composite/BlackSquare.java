package com.jad.product.composite;

import com.jad.interpreter.ProductExpression;
import com.jad.product.leaf.FilledSquare;

public class BlackSquare extends CompositeProduct {
    public BlackSquare() {
        super("Carré noir", new ProductExpression(new FilledSquare('O')));
    }
}
