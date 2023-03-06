package com.jad.observer;

import com.jad.observer.cat.Cat;
import com.jad.observer.mouse.Mouse;

import java.util.ArrayList;

public class House {
    private final static int nbMice = 5;

    private final ArrayList<Mouse> mice = new ArrayList<>();

    private final Cat cat = new Cat(this);

    public House() {
        for (int i = 0; i < House.nbMice; i++) {
            this.mice.add(new Mouse(this));
        }
    }

    public ArrayList<Mouse> getMice() {
        return this.mice;
    }

    public Cat getCat() {
        return cat;
    }

    public void run() {
        for(Mouse mouse : this.mice) {
            mouse.start();
        }
        this.cat.start();
    }
}
