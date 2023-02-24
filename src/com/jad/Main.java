package com.jad;

import com.jad.pizzeria.Pizzeria;
import com.jad.pizzeria.pizza.Pizza;

public class Main {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();

        Client client = new Client();
        for (int i = 0; i < 10; i++) {
            client.eat(pizzeria);
        }
    }
}
