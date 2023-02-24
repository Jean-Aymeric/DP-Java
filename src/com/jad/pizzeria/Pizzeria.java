package com.jad.pizzeria;

import com.jad.pizzeria.pizza.Pizza;

import java.util.ArrayList;

public class Pizzeria {
    private static Pizzeria instance = null;
    private final ArrayList<PizzaFactory> pizzaFactories = new ArrayList<>();

    private Pizzeria() {
        this.pizzaFactories.add(new FourCheesesFactory());
        this.pizzaFactories.add(new NeapolitanFactory());
        this.pizzaFactories.add(new RomanFactory());
    }

    public static Pizzeria getInstance() {
        if (Pizzeria.instance == null) {
            Pizzeria.instance = new Pizzeria();
        }
        return Pizzeria.instance;
    }

    public Pizza make(String pizzaName) {
        return this.getFactory(pizzaName).make();
    }

    public PizzaFactory getFactory(String pizzaNameMade) {
        for (PizzaFactory pizzaFactory : this.pizzaFactories) {
            if (pizzaFactory.isPizzaNameMade(pizzaNameMade)) {
                return pizzaFactory;
            }
        }
        return this.pizzaFactories.get(0);
    }

    public ArrayList<String> getMenu() {
        ArrayList<String> menu = new ArrayList<>();
        for (PizzaFactory pizzaFactory : this.pizzaFactories) {
            menu.add(pizzaFactory.getPizzaNameMade());
        }
        return menu;
    }

    public PizzaFactory getFourCheeseFactory() {
        return this.getFactory("4 fromages");
    }

    public PizzaFactory getNeapolitanFactory() {
        return this.getFactory("Napolitaine");
    }

    public PizzaFactory getRomanFactory() {
        return this.getFactory("Romaines");
    }

    public void addPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactories.add(pizzaFactory);
    }
}
