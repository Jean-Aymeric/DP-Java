package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;

public abstract class PizzaFactory {
    public static PizzaFactory FourCheeseFactory = new FourCheesesFactory();
    public static PizzaFactory NeapolitanFactory = new NeapolitanFactory();
    public static PizzaFactory RomanFactory = new RomanFactory();

    public abstract Pizza make();
}
