package com.jad.character.characteristic;

public enum Characteristic {
    Strength("Force"), Dexterity("Dextérité"), Stamina("Endurance"), Wisdom("Sagesse"), Charisma("Charisme");

    private final String name;

    Characteristic(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name.substring(0,3);
    }
}
