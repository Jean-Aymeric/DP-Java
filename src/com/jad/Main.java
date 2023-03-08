package com.jad;

import com.jad.product.IProduct;
import com.jad.product.Product;
import com.jad.product.leaf.*;
import com.jad.product.operation.complex.Stack;
import com.jad.product.operation.complex.StickLeftToRight;
import com.jad.product.operation.complex.StickTopToBottom;
import com.jad.product.operation.simple.CropBottomRightCorner;
import com.jad.product.operation.simple.Sand;

public class Main {

    public static void main(String[] args) {
        Product emptySquare = new EmptySquare('R');
        Product filledSquare = new FilledSquare('B');
        Product emptyCircle = new EmptyCircle('G');
        Product filledCircle = new FilledCircle('Y');

        emptySquare.draw();
//        filledCircle.draw();
//        emptyCircle.draw();
//        filledCircle.draw();
        IProduct p = new Sand().execute(new CropBottomRightCorner().execute(filledCircle));
        p.draw();
        p = new Stack().execute(filledSquare, p, emptyCircle);
        p.draw();
        p = new StickTopToBottom().execute(p, filledCircle, emptySquare);
        p = new StickLeftToRight().execute(p, p, p, p, p);
        p.draw();

        System.out.println(p.getDescription());
    }
}
