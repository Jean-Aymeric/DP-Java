package com.jad.weapon.leaf;

import com.jad.weapon.AttackType;
import com.jad.weapon.Weapon;

public class LeafWeapon extends Weapon {
    private final String name;
    private final int damage;
    private final AttackType attackType;

    public LeafWeapon(final String key, String name, int damage, AttackType attackType) {
        super(key);
        this.name = name;
        this.damage = damage;
        this.attackType = attackType;
    }

    @Override
    public final String getName() {
        return this.name;
    }

    @Override
    public final int getDamage() {
        return this.damage;
    }

    @Override
    public final AttackType getAttackType() {
        return attackType;
    }
}
