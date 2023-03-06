package com.jad.pizzeria.drink;

import com.jad.pizzeria.Product;

public abstract class Drink extends Product {
    public Drink(final String name) {
        super("Boisson", name);
    }
}
