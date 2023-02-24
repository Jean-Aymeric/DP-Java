package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Neapolitan;
import com.jad.pizzeria.pizza.Pizza;

final class NeapolitanFactory extends PizzaFactory {
    NeapolitanFactory() {
        super("Napolitaine");
    }

    @Override
    public Pizza make() {
        return new Neapolitan();
    }
}
