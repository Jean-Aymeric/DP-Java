package com.jad.product.composite;

import com.jad.interpreter.ProductExpression;
import com.jad.product.Product;
import com.jad.product.leaf.FilledSquare;

public class WhiteSquare extends Product {
    public WhiteSquare() {
        super("Carré blanc", new ProductExpression(new FilledSquare(' ')));
    }
}
