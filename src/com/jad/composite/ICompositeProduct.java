package com.jad.composite;

public interface ICompositeProduct extends IProduct {
    void addProduct(IProduct product);

    void removeProduct(IProduct product);
}
