package com.jad.pizzeria.dessert.factory;

import com.jad.pizzeria.ProductFactory;
import com.jad.pizzeria.dessert.Dessert;

public abstract class DessertFactory extends ProductFactory {
    protected DessertFactory(final String dessertNameMade) {
        super(dessertNameMade);
    }

    public final String getDessertNameMade() {
        return this.getProductNameMade();
    }

    @Override
    public abstract Dessert make();

    public final boolean isDessertNameMade(String dessertNameMade) {
        return this.isProductNameMade(dessertNameMade);
    }
}
