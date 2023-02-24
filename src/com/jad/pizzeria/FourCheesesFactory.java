package com.jad.pizzeria;

import com.jad.pizzeria.pizza.FourCheeses;
import com.jad.pizzeria.pizza.Pizza;

final class FourCheesesFactory extends PizzaFactory {
    FourCheesesFactory() {
        super("4 fromages");
    }

    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}
