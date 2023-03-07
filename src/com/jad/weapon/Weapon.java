package com.jad.weapon;

public abstract class Weapon implements IWeapon {
    @Override
    public final String attack() {
        return getName() + " " + this.getAttackType() + "(" + getDamage() + ") ";
    }
}
