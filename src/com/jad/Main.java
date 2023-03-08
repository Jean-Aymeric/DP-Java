package com.jad;

import com.jad.interpreter.ComplexOperationExpression;
import com.jad.interpreter.ProductExpression;
import com.jad.interpreter.RecipeContext;
import com.jad.product.IProduct;
import com.jad.product.Product;
import com.jad.product.composite.TicTacToe;
import com.jad.product.leaf.*;
import com.jad.product.operation.complex.Stack;
import com.jad.product.operation.complex.StickLeftToRight;
import com.jad.product.operation.complex.StickTopToBottom;
import com.jad.product.operation.simple.CropBottomRightCorner;
import com.jad.product.operation.simple.CropTopLeftCorner;
import com.jad.product.operation.simple.Sand;

public class Main {

    public static void main(String[] args) {
        Product emptySquare = new EmptySquare('R');
        Product filledSquare = new FilledSquare('B');
        Product emptyCircle = new EmptyCircle('G');
        Product filledCircle = new FilledCircle('Y');

        IProduct p = new Sand().execute(new CropBottomRightCorner().execute(filledCircle));
        p = new Stack().execute(filledSquare, p, emptyCircle);
        p = new StickTopToBottom().execute(p, filledCircle, emptySquare);
        p = new CropTopLeftCorner().execute(new StickLeftToRight().execute(filledCircle, p, p, p, p, filledCircle));
        p.draw();

        System.out.println(p.getDescription());

        RecipeContext context = new RecipeContext();

        new ComplexOperationExpression(new Stack(),
                new ProductExpression(new FilledCircle('U')),
                new ProductExpression(new EmptyCircle('O'))
        ).interpret(context);

        context.getProduct().draw();
        new TicTacToe().draw();
    }
}
