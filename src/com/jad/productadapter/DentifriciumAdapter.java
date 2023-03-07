package com.jad.productadapter;

import com.jad.composite.IProduct;
import com.jad.productadapter.antiqua.Dentifricium;

public class DentifriciumAdapter implements IProduct {
    private final Dentifricium dentifricium = new Dentifricium();

    @Override
    public String getName() {
        return new String(this.dentifricium.nomen);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
