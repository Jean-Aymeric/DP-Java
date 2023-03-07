package com.jad.weapon.decorator;

import com.jad.weapon.AttackType;
import com.jad.weapon.IWeapon;

public abstract class AbstractWeaponDecorator implements IWeapon {
    private IWeapon weapon;

    public AbstractWeaponDecorator(final IWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public final String getName() {
        return this.weapon.getName() + getDecoratedName() + ((this.getDecoratedDamage()!=0)?"("+((this.getDecoratedDamage()>0)?"+":"") + this.getDecoratedDamage()+")":"");
    }

    public abstract String getDecoratedName();

    @Override
    public final int getDamage() {
        return this.weapon.getDamage() + getDecoratedDamage();
    }

    public abstract int getDecoratedDamage();

    @Override
    public final AttackType getAttackType() {
        return this.getDecoratedAttackType();
    }

    public AttackType getDecoratedAttackType() {
        return this.weapon.getAttackType();
    }

    public final String attack() {
        return getName() + " " + this.getAttackType() + "(" + getDamage() + ") ";
    }
}
