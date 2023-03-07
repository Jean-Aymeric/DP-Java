package com.jad.character.characteristic;

public enum Characteristic {
    Strength("Force"), Dexterity("Dextérité"), Stamina("Endurance"), Wisdom("Sagesse"), Charisma("Charisme");

    private final String name;

    Characteristic(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    @Override
    public final String toString() {
        return this.name.substring(0,3);
    }
}
