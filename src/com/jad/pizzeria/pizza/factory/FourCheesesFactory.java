package com.jad.pizzeria.pizza.factory;

import com.jad.pizzeria.pizza.FourCheeses;
import com.jad.pizzeria.pizza.Pizza;

public final class FourCheesesFactory extends PizzaFactory {
    public FourCheesesFactory() {
        super("4 fromages");
    }

    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}
