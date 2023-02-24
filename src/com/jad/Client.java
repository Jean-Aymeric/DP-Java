package com.jad;

import com.jad.pizza.FourCheeses;
import com.jad.pizza.Neapolitan;
import com.jad.pizza.Pizza;
import com.jad.pizza.Roman;

import java.util.Random;

public class Client {
    public void eat() {
        Pizza pizza;
        switch (new Random().nextInt(3)) {
            case 1:
                pizza = new Neapolitan();
                break;
            case 2:
                pizza = new Roman();
                break;
            default:
                pizza = new FourCheeses();
                break;
        }
        System.out.println("Je mange une " + pizza);
    }
}
