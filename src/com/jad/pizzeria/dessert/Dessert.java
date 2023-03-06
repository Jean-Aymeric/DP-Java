package com.jad.pizzeria.dessert;

import com.jad.pizzeria.Product;

public abstract class Dessert extends Product {
    public Dessert(final String name) {
        super("Dessert", name);
    }
}
