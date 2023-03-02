package com.jad;

import com.jad.observer.cat.Cat;
import com.jad.observer.mouse.Mouse;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Cat gribouille = new Cat();
        ArrayList<Mouse> mice = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mice.add(new Mouse());
        }
        for(Mouse mouse : mice) {
            mouse.start();
        }
        gribouille.start();
    }
}
