package com.jad.product.composite;

import com.jad.interpreter.ComplexOperationExpression;
import com.jad.interpreter.ProductExpression;
import com.jad.product.leaf.Cross;
import com.jad.product.leaf.FilledSquare;
import com.jad.product.operation.complex.Stack;

public class CrossSquare extends CompositeProduct {
    public CrossSquare() {
        super("Croix", new ComplexOperationExpression(new Stack(),new ProductExpression(new FilledSquare(' ')), new ProductExpression(new Cross('X'))));
    }
}
