package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.Roman;

final class RomanFactory extends PizzaFactory {
    @Override
    public Pizza make() {
        return new Roman();
    }
}
