package com.jad.herd;

import java.util.ArrayList;

public class Herd {
    private final ArrayList<Cow> cows = new ArrayList<>();

    public void addCow(final Cow cow) {
        this.cows.add(cow);
    }

    public void removeCow(final Cow cow) {
        this.cows.remove(cow);
    }

    public void makeThemEat() {
        for (final Cow cow : cows) {
            cow.eat();
        }
    }

    public void makeThemSpeak() {
        for (final Cow cow : cows) {
            cow.speak();
        }
    }

    public Cow getCowByName(final String name) {
        for (final Cow cow : cows) {
            if (cow.getName().equals(name)) {
                return cow;
            }
        }
        return null;
    }
}
