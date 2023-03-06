package com.jad.pizzeria;

import com.jad.pizzeria.dessert.Dessert;
import com.jad.pizzeria.dessert.factory.DessertFactory;
import com.jad.pizzeria.drink.Drink;
import com.jad.pizzeria.drink.factory.DrinkFactory;
import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.factory.PizzaFactory;

import java.util.ArrayList;

public interface IPizzeria {
    Product make(String productName);

    Pizza makePizza(String pizzaName);

    Drink makeDrink(String drinkName);

    Dessert makeDessert(String dessertName);

    PizzaFactory getPizzaFactory(String pizzaNameMade);

    DrinkFactory getDrinkFactory(String drinkNameMade);

    DessertFactory getDessertFactory(String dessertNameMade);

    ArrayList<String> getPizzaMenu();

    ArrayList<String> getDrinkMenu();

    ArrayList<String> getDessertMenu();

    PizzaFactory getFourCheeseFactory();

    PizzaFactory getNeapolitanFactory();

    PizzaFactory getRomanFactory();

    void addPizzaFactory(PizzaFactory pizzaFactory);

    DessertFactory getCookieFactory();

    DessertFactory getDonutFactory();

    DrinkFactory getColaFactory();

    DrinkFactory getSparklingWaterFactory();
}
