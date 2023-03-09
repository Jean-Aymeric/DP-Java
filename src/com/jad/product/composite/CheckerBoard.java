package com.jad.product.composite;

import com.jad.interpreter.ComplexOperationExpression;
import com.jad.interpreter.ProductExpression;
import com.jad.product.Product;
import com.jad.product.operation.complex.StickLeftToRight;
import com.jad.product.operation.complex.StickTopToBottom;

public class CheckerBoard extends Product {
    public CheckerBoard() {
        super("Damier 3x3",
                new ComplexOperationExpression(new StickTopToBottom(),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new BlackSquare()),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new BlackSquare())),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new BlackSquare()),
                                new ProductExpression(new WhiteSquare())),
                        new ComplexOperationExpression(new StickLeftToRight(),
                                new ProductExpression(new BlackSquare()),
                                new ProductExpression(new WhiteSquare()),
                                new ProductExpression(new BlackSquare()))
                )
        );
    }
}
