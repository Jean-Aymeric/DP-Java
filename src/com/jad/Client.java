package com.jad;

import com.jad.pizzeria.Pizzeria;
import com.jad.pizzeria.pizza.Pizza;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public void eat(final Pizzeria pizzeria) {
        ArrayList<String> menu = pizzeria.getMenu();
        Pizza pizza = pizzeria.make(menu.get(new Random().nextInt(menu.size())));
        System.out.println("Je mange une " + pizza);
    }
}
