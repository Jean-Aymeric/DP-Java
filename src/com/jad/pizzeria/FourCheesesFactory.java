package com.jad.pizzeria;

import com.jad.pizzeria.pizza.FourCheeses;
import com.jad.pizzeria.pizza.Pizza;

final class FourCheesesFactory extends PizzaFactory {
    @Override
    public Pizza make() {
        return new FourCheeses();
    }
}
