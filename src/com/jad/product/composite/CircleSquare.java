package com.jad.product.composite;

import com.jad.interpreter.ComplexOperationExpression;
import com.jad.interpreter.ProductExpression;
import com.jad.product.Product;
import com.jad.product.leaf.Cross;
import com.jad.product.leaf.EmptyCircle;
import com.jad.product.leaf.FilledSquare;
import com.jad.product.operation.complex.Stack;

public class CircleSquare extends Product {
    public CircleSquare() {
        super("Cercle", new ComplexOperationExpression(new Stack(),new ProductExpression(new FilledSquare(' ')), new ProductExpression(new EmptyCircle('O'))));
    }
}
