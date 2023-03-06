package com.jad.pizzeria.pizza.factory;

import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.Vegetarian;

public final class VegetarianFactory extends PizzaFactory {
    public VegetarianFactory() {
        super("Végétarienne");
    }

    @Override
    public Pizza make() {
        return new Vegetarian();
    }
}
