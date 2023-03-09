package com.jad;

import com.jad.product.Product;

public class Main {

    public static void main(String[] args) {
        Product ttt = new Product("Morpion en manuel",
                    "StickTopToBottom(StickLeftToRight(CrossSquare, WhiteSquare, CircleSquare)," +
                            "StickLeftToRight(WhiteSquare, CrossSquare, CircleSquare)," +
                            "StickLeftToRight(WhiteSquare, WhiteSquare, CrossSquare))");
        ttt.draw();
    }
}
