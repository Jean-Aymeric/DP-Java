package com.jad.character;

import com.jad.character.characteristic.Characteristic;
import com.jad.dice.Dice;

import java.util.Hashtable;

public class Character {
    private final Hashtable<Characteristic, Integer>characteristics = new Hashtable<>();
    private String name;

    public Character() {
        this("Inconnu");
    }

    public Character(final String name) {
        for (Characteristic characteristic : Characteristic.values()) {
            this.characteristics.put(characteristic, Dice.D6.roll(3));
        }
        this.name = name;
    }

    public int getCharacteristic(Characteristic characteristic) {
        return this.characteristics.get(characteristic);
    }

    public void setCharacteristics(Characteristic characteristics, int value) {
        if (this.characteristics.contains(characteristics)) {
            this.characteristics.replace(characteristics, value);
        } else {
            this.characteristics.put(characteristics, value);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name).append("\n");
        for(Characteristic characteristic : this.characteristics.keySet()) {
            result.append("\t").append(characteristic).append(" : ").append(this.getCharacteristic(characteristic)).append("\n");
        }
        return result.toString();
    }

    public int getHitPoints() {
        return this.getCharacteristic(Characteristic.Strength);
    }

    public String hit() {
        return "Je tape comme une tanche : " + this.getHitPoints();
    }
}
