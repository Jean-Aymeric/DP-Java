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
    private static final int NbMaxPizzas = 5;
    private final Pizzeria pizzeria;
    private int nbPizzasMade;

    public ProxyPizzeria(final Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
        this.nbPizzasMade = 0;
    }

    private Product check(Product product) {
        if (product.getProduct().equals("Pizza")) {
            return check((Pizza) product);
        }
        return product;
    }

    private Pizza check(Pizza pizza) {
        this.nbPizzasMade += (! pizza.getName().equals("Végétarienne")) ? 1 : 0;
        if (nbPizzasMade > ProxyPizzeria.NbMaxPizzas) {
            return this.pizzeria.makePizza("Végétarienne");
        }
        return pizza;
    }

    private Dessert check(Dessert dessert) {
        return dessert;
    }

    private Drink check(Drink drink) {
        return drink;
    }

    @Override
    public Product make(final String productName) {
        return this.check(this.pizzeria.make(productName));
    }

    @Override
    public Pizza makePizza(final String pizzaName) {
        return this.check(this.pizzeria.makePizza(pizzaName));
    }

    @Override
    public Drink makeDrink(final String drinkName) {
        return this.check(this.pizzeria.makeDrink(drinkName));
    }

    @Override
    public Dessert makeDessert(final String dessertName) {
        return this.check(this.pizzeria.makeDessert(dessertName));
    }

    @Override
    public PizzaFactory getPizzaFactory(final String pizzaNameMade) {
        return null;
    }

    @Override
    public DrinkFactory getDrinkFactory(final String drinkNameMade) {
        return null;
    }

    @Override
    public DessertFactory getDessertFactory(final String dessertNameMade) {
        return null;
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
        return null;
    }

    @Override
    public PizzaFactory getNeapolitanFactory() {
        return null;
    }

    @Override
    public PizzaFactory getRomanFactory() {
        return null;
    }

    @Override
    public void addPizzaFactory(final PizzaFactory pizzaFactory) {
        this.pizzeria.addPizzaFactory(pizzaFactory);
    }

    @Override
    public DessertFactory getCookieFactory() {
        return null;
    }

    @Override
    public DessertFactory getDonutFactory() {
        return null;
    }

    @Override
    public DrinkFactory getColaFactory() {
        return null;
    }

    @Override
    public DrinkFactory getSparklingWaterFactory() {
        return null;
    }
}
