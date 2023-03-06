package com.jad.pizzeria.pizza;

import com.jad.pizzeria.Product;

public abstract class Pizza extends Product {
    protected Pizza(final String name) {
        super("Pizza", name);
    }
}
