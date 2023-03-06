package com.jad.pizzeria.drink.factory;

import com.jad.pizzeria.ProductFactory;
import com.jad.pizzeria.drink.Drink;

public abstract class DrinkFactory extends ProductFactory {
    protected DrinkFactory(final String drinkNameMade) {
        super(drinkNameMade);
    }

    public final String getDrinkNameMade() {
        return this.getProductNameMade();
    }

    @Override
    public abstract Drink make();

    public final boolean isDrinkNameMade(String drinkNameMade) {
        return this.isProductNameMade(drinkNameMade);
    }
}
