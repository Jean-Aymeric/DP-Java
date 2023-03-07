package com.jad.productadapter;

import com.jad.composite.ICompositeProduct;
import com.jad.composite.IProduct;
import com.jad.productadapter.antiqua.Capsula;
import com.jad.productadapter.antiqua.Res;

import java.util.Arrays;

public class CapsulaAdapter implements ICompositeProduct {
    private final Capsula capsula = new Capsula();
    private int nbProducts = 0;

    @Override
    public String getName() {
        return new String(this.capsula.nomen);
    }

    private String proponoToString() {
        StringBuilder result = new StringBuilder();
        char[] propono = this.capsula.propono();
        for (int i = 0; propono[i] != 0; i++) {
            result.append(propono[i]);
        }
        return result.toString();
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.proponoToString() + ")";
    }

    @Override
    public void addProduct(final IProduct product) {
        if (nbProducts < Capsula.Statura) {
            this.capsula.res[this.nbProducts++] = new Res(product.getName().toCharArray()) {
            };
        }
    }

    @Override
    public void removeProduct(final IProduct product) {
        int indexToRemove = - 1;
        for (int i = 0; (i < nbProducts) && (indexToRemove == -1); i++) {
            if (new String(this.capsula.res[i].nomen).equals(product.getName())) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != - 1) {
            if (nbProducts - 1 - indexToRemove >= 0) {
                System.arraycopy(this.capsula.res, indexToRemove + 1, this.capsula.res, indexToRemove, nbProducts - 1 - indexToRemove);
            }
            this.capsula.res[--nbProducts] = null;
        }
    }
}