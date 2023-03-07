package com.jad.weapon;

public abstract class Weapon implements IWeapon {
    private final String name;
    private final int damage;
    private final AttackType attackType;

    public Weapon(final String name, final int damage, final AttackType attackType) {
        this.name = name;
        this.damage = damage;
        this.attackType = attackType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public AttackType getAttackType() {
        return attackType;
    }

    @Override
    public String attack() {
        return getName() + " " + this.getAttackType() + "(" + getDamage() + ") ";
    }
}
