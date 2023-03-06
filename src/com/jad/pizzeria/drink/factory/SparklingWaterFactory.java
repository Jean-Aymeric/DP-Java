package com.jad.pizzeria.drink.factory;

import com.jad.pizzeria.drink.Drink;
import com.jad.pizzeria.drink.SparklingWater;

public class SparklingWaterFactory extends DrinkFactory{
    public SparklingWaterFactory() {
        super("eau gazeuse");
    }

    @Override
    public Drink make() {
        return new SparklingWater();
    }
}
