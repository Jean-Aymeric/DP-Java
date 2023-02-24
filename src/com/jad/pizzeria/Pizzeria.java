package com.jad.pizzeria;

public class Pizzeria {
    private final PizzaFactory fourCheeseFactory = new FourCheesesFactory();
    private final PizzaFactory neapolitanFactory = new NeapolitanFactory();
    private final PizzaFactory romanFactory = new RomanFactory();

    public PizzaFactory getFourCheeseFactory() {
        return fourCheeseFactory;
    }

    public PizzaFactory getNeapolitanFactory() {
        return neapolitanFactory;
    }

    public PizzaFactory getRomanFactory() {
        return romanFactory;
    }
}
