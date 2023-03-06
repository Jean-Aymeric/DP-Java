package com.jad.pizzeria.drink.factory;

import com.jad.pizzeria.drink.Cola;
import com.jad.pizzeria.drink.Drink;

public class ColaFactory extends DrinkFactory{
    public ColaFactory() {
        super("cola");
    }

    @Override
    public Drink make() {
        return new Cola();
    }
}
