package com.jad.dice;

import java.util.Random;

public enum Dice {
    D2(2), D4(4), D6(6), D8(8), D10(10), D20(20), D100(100);
    private final int nbSides;

    Dice(final int nbSides) {
        this.nbSides = nbSides;
    }

    public int roll() {
        return new Random().nextInt(nbSides) + 1;
    }

    public int roll(int nbDice) {
        int result = 0;
        for(int i = 0; i < nbDice; i++) {
            result += this.roll();
        }
        return result;
    }
}
