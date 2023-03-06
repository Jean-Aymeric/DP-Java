package com.jad.pizzeria.dessert.factory;

import com.jad.pizzeria.dessert.Cookie;
import com.jad.pizzeria.dessert.Dessert;

public class CookieFactory extends DessertFactory {
    public CookieFactory() {
        super("cookie");
    }

    @Override
    public Dessert make() {
        return new Cookie();
    }
}
