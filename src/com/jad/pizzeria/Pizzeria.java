package com.jad.pizzeria;

import com.jad.pizzeria.dessert.Dessert;
import com.jad.pizzeria.dessert.factory.CookieFactory;
import com.jad.pizzeria.dessert.factory.DessertFactory;
import com.jad.pizzeria.dessert.factory.DonutFactory;
import com.jad.pizzeria.drink.Drink;
import com.jad.pizzeria.drink.factory.ColaFactory;
import com.jad.pizzeria.drink.factory.DrinkFactory;
import com.jad.pizzeria.drink.factory.SparklingWaterFactory;
import com.jad.pizzeria.pizza.Pizza;
import com.jad.pizzeria.pizza.factory.FourCheesesFactory;
import com.jad.pizzeria.pizza.factory.NeapolitanFactory;
import com.jad.pizzeria.pizza.factory.PizzaFactory;
import com.jad.pizzeria.pizza.factory.RomanFactory;

import java.util.ArrayList;

public class Pizzeria {
    private static Pizzeria instance = null;
    private final ArrayList<PizzaFactory> pizzaFactories = new ArrayList<>();
    private final ArrayList<DessertFactory> dessertFactories = new ArrayList<>();
    private final ArrayList<DrinkFactory> drinkFactories = new ArrayList<>();

    private Pizzeria() {
        this.pizzaFactories.add(new FourCheesesFactory());
        this.pizzaFactories.add(new NeapolitanFactory());
        this.pizzaFactories.add(new RomanFactory());

        this.drinkFactories.add(new ColaFactory());
        this.drinkFactories.add(new SparklingWaterFactory());

        this.dessertFactories.add(new CookieFactory());
        this.dessertFactories.add(new DonutFactory());
    }

    public static Pizzeria getInstance() {
        if (Pizzeria.instance == null) {
            Pizzeria.instance = new Pizzeria();
        }
        return Pizzeria.instance;
    }

    public Product make(String productName) {
        Product product = this.makePizza(productName);
        if (product != null) {
            return product;
        }
        product = this.makeDrink(productName);
        if (product != null) {
            return product;
        }
        return this.makeDessert(productName);
    }

    public Pizza makePizza(String pizzaName) {
        return this.getPizzaFactory(pizzaName).make();
    }

    public Drink makeDrink(String drinkName) {
        return this.getDrinkFactory(drinkName).make();
    }

    public Dessert makeDessert(String dessertName) {
        return this.getDessertFactory(dessertName).make();
    }

    public static ProductFactory GetProductFactory(String productNameMade, ArrayList<? extends ProductFactory> factories) {
        for (ProductFactory productFactory : factories) {
            if (productFactory.isProductNameMade(productNameMade)) {
                return productFactory;
            }
        }
        return null;
    }

    public PizzaFactory getPizzaFactory(String pizzaNameMade) {
        return (PizzaFactory) Pizzeria.GetProductFactory(pizzaNameMade, this.pizzaFactories);
    }

    public DrinkFactory getDrinkFactory(String drinkNameMade) {
        return (DrinkFactory) Pizzeria.GetProductFactory(drinkNameMade, this.drinkFactories);
    }

    public DessertFactory getDessertFactory(String dessertNameMade) {
        return (DessertFactory) Pizzeria.GetProductFactory(dessertNameMade, this.dessertFactories);
    }

    private static ArrayList<String> GetMenuFromFactories(ArrayList<? extends ProductFactory> factories) {
        ArrayList<String> menu = new ArrayList<>();
        for (ProductFactory factory : factories) {
            menu.add(factory.getProductNameMade());
        }
        return menu;
    }

    public ArrayList<String> getPizzaMenu() {
        return Pizzeria.GetMenuFromFactories(this.pizzaFactories);
    }

    public ArrayList<String> getDrinkMenu() {
        return Pizzeria.GetMenuFromFactories(this.drinkFactories);
    }

    public ArrayList<String> getDessertMenu() {
        return Pizzeria.GetMenuFromFactories(this.dessertFactories);
    }

    public PizzaFactory getFourCheeseFactory() {
        return this.getPizzaFactory("4 fromages");
    }

    public PizzaFactory getNeapolitanFactory() {
        return this.getPizzaFactory("Napolitaine");
    }

    public PizzaFactory getRomanFactory() {
        return this.getPizzaFactory("Romaines");
    }

    public void addPizzaFactory(PizzaFactory pizzaFactory) {
        this.pizzaFactories.add(pizzaFactory);
    }

    public DessertFactory getCookieFactory() {
        return this.getDessertFactory("cookie");
    }

    public DessertFactory getDonutFactory() {
        return this.getDessertFactory("donut");
    }

    public DrinkFactory getColaFactory() {
        return this.getDrinkFactory("cola");
    }

    public DrinkFactory getSparklingWaterFactory() {
        return this.getDrinkFactory("eau gazeuse");
    }
}
