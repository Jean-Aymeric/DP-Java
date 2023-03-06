package com.jad;

import com.jad.pizzeria.Pizzeria;
import com.jad.pizzeria.dessert.Dessert;
import com.jad.pizzeria.drink.Drink;
import com.jad.pizzeria.pizza.Pizza;

import java.util.Random;

public class Client {
    public void eat(final Pizzeria pizzeria) {
        Pizza pizza = pizzeria.makePizza(pizzeria.getPizzaMenu().get(new Random().nextInt(pizzeria.getPizzaMenu().size())));
        Drink drink = pizzeria.makeDrink(pizzeria.getDrinkMenu().get(new Random().nextInt(pizzeria.getDrinkMenu().size())));
        Dessert dessert = pizzeria.makeDessert(pizzeria.getDessertMenu().get(new Random().nextInt(pizzeria.getDessertMenu().size())));
        System.out.println("Je mange une " + pizza + " en buvant " + drink + " en je finirais avec un " + dessert);
    }
}
