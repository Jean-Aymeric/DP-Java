package com.jad.pizzeria.dessert.factory;

import com.jad.pizzeria.dessert.Dessert;
import com.jad.pizzeria.dessert.Donut;

public class DonutFactory extends DessertFactory {
    public DonutFactory() {
        super("donut");
    }

    @Override
    public Dessert make() {
        return new Donut();
    }
}
