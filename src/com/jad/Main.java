package com.jad;

import com.jad.pizzeria.Pizzeria;

public class Main {

    public static void main(String[] args) {
        Pizzeria pizzeria = Pizzeria.getInstance();

        Client client = new Client();
        for (int i = 0; i < 10; i++) {
            client.eat(pizzeria);
        }
    }
}
