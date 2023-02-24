package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.Roman;

final class RomanFactory extends PizzaFactory {
    RomanFactory() {
        super("Romaine");
    }

    @Override
    public Pizza make() {
        return new Roman();
    }
}
