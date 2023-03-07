package com.jad.weapon;

public interface IWeapon {
    String getName();

    int getDamage();

    AttackType getAttackType();

    String attack();
}
