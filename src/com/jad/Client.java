package com.jad;

import com.jad.pizzeria.PizzaFactory;

import java.util.Random;

public class Client {
    public void eat() {
        com.jad.pizzeria.pizza.Pizza pizza;
        switch (new Random().nextInt(3)) {
            case 1:
                pizza = PizzaFactory.NeapolitanFactory.make();
                break;
            case 2:
                pizza = PizzaFactory.RomanFactory.make();
                break;
            default:
                pizza = PizzaFactory.FourCheeseFactory.make();
                break;
        }
        System.out.println("Je mange une " + pizza);
    }
}
