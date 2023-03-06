package com.jad.pizzeria.pizza;

import com.jad.pizzeria.IPizzeria;
import com.jad.pizzeria.Pizzeria;
import com.jad.pizzeria.Product;
import com.jad.pizzeria.dessert.Dessert;
import com.jad.pizzeria.dessert.factory.DessertFactory;
import com.jad.pizzeria.drink.Drink;
import com.jad.pizzeria.drink.factory.DrinkFactory;
import com.jad.pizzeria.pizza.factory.PizzaFactory;

import java.util.ArrayList;

public class ProxyPizzeria implements IPizzeria {
    private final Pizzeria pizzeria;
    private int nbPizzasMade;

    public ProxyPizzeria(final Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
        this.nbPizzasMade = 0;
    }

    @Override
    public Product make(final String productName) {
        return this.pizzeria.make(productName);
    }

    @Override
    public Pizza makePizza(final String pizzaName) {
        return this.pizzeria.makePizza(pizzaName);
    }

    @Override
    public Drink makeDrink(final String drinkName) {
        return this.pizzeria.makeDrink(drinkName);
    }

    @Override
    public Dessert makeDessert(final String dessertName) {
        return this.pizzeria.makeDessert(dessertName);
    }

    @Override
    public PizzaFactory getPizzaFactory(final String pizzaNameMade) {
        return this.pizzeria.getPizzaFactory(pizzaNameMade);
    }

    @Override
    public DrinkFactory getDrinkFactory(final String drinkNameMade) {
        return this.pizzeria.getDrinkFactory(drinkNameMade);
    }

    @Override
    public DessertFactory getDessertFactory(final String dessertNameMade) {
        return this.pizzeria.getDessertFactory(dessertNameMade);
    }

    @Override
    public ArrayList<String> getPizzaMenu() {
        return this.pizzeria.getPizzaMenu();
    }

    @Override
    public ArrayList<String> getDrinkMenu() {
        return this.pizzeria.getDrinkMenu();
    }

    @Override
    public ArrayList<String> getDessertMenu() {
        return this.pizzeria.getDessertMenu();
    }

    @Override
    public PizzaFactory getFourCheeseFactory() {
        return this.pizzeria.getFourCheeseFactory();
    }

    @Override
    public PizzaFactory getNeapolitanFactory() {
        return this.pizzeria.getNeapolitanFactory();
    }

    @Override
    public PizzaFactory getRomanFactory() {
        return this.pizzeria.getRomanFactory();
    }

    @Override
    public void addPizzaFactory(final PizzaFactory pizzaFactory) {
        this.pizzeria.addPizzaFactory(pizzaFactory);
    }

    @Override
    public DessertFactory getCookieFactory() {
        return this.pizzeria.getCookieFactory();
    }

    @Override
    public DessertFactory getDonutFactory() {
        return this.pizzeria.getDonutFactory();
    }

    @Override
    public DrinkFactory getColaFactory() {
        return this.pizzeria.getColaFactory();
    }

    @Override
    public DrinkFactory getSparklingWaterFactory() {
        return this.pizzeria.getSparklingWaterFactory();
    }
}
