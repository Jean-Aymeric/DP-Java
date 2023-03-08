package com.jad;

import com.jad.product.IProduct;
import com.jad.product.Product;
import com.jad.product.leaf.*;
import com.jad.product.operation.simple.CropBottomRightCorner;
import com.jad.product.operation.simple.Sand;

public class Main {

    public static void main(String[] args) {
        Product emptySquare = new EmptySquare('R');
        Product filledSquare = new FilledSquare('B');
        Product emptyCircle = new EmptyCircle('G');
        Product filledCircle = new FilledCircle('Y');

//        emptySquare.draw();
        filledCircle.draw();
//        emptyCircle.draw();
//        filledCircle.draw();
        IProduct p = new Sand().execute(new CropBottomRightCorner().execute(filledCircle));
        p.draw();
        System.out.println(p.getDescription());
    }
}
