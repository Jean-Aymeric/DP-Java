package com.jad.pizzeria.pizza.factory;

import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.Roman;

public final class RomanFactory extends PizzaFactory {
    public RomanFactory() {
        super("Romaine");
    }

    @Override
    public Pizza make() {
        return new Roman();
    }
}
