package com.jad.product.composite;

import com.jad.interpreter.ProductExpression;
import com.jad.product.Product;
import com.jad.product.leaf.FilledSquare;

public class BlackSquare extends Product {
    public BlackSquare() {
        super("Carré noir", new ProductExpression(new FilledSquare('O')));
    }
}
