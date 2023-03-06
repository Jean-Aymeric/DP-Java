package com.jad.pizzeria.pizza.factory;

import com.jad.pizzeria.pizza.Neapolitan;
import com.jad.pizzeria.pizza.Pizza;

public final class NeapolitanFactory extends PizzaFactory {
    public NeapolitanFactory() {
        super("Napolitaine");
    }

    @Override
    public Pizza make() {
        return new Neapolitan();
    }
}
