package com.jad.weapon;

public abstract class Weapon implements IWeapon {
    private final String key;

    protected Weapon(final String key) {
        this.key = key;
    }

    @Override
    public final String attack() {
        return getName() + " " + this.getAttackType() + "(" + getDamage() + ") ";
    }

    @Override
    public Boolean isKey(final String key) {
        return this.key.equals(key);
    }
}
