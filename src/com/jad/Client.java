package com.jad;

import com.jad.pizzeria.Pizzeria;

import java.util.Random;

public class Client {
    public void eat(final Pizzeria pizzeria) {
        com.jad.pizzeria.pizza.Pizza pizza;
        switch (new Random().nextInt(3)) {
            case 1:
                pizza = pizzeria.getNeapolitanFactory().make();
                break;
            case 2:
                pizza = pizzeria.getRomanFactory().make();
                break;
            default:
                pizza = pizzeria.getFourCheeseFactory().make();
                break;
        }
        System.out.println("Je mange une " + pizza);
    }
}
