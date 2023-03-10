package com.jad.weapon.decorator;

import com.jad.compositespecification.Specification;
import com.jad.weapon.AttackType;
import com.jad.weapon.IWeapon;

public abstract class AbstractWeaponDecorator implements IWeapon {
    private final IWeapon weapon;
    private final String key;

    public AbstractWeaponDecorator(final IWeapon weapon, final String key, final Specification<IWeapon> rule) {
        this.weapon = weapon;
        this.key = key;
        if (!rule.isSatisfiedBy(this.weapon)) {
            throw new IllegalArgumentException("The weapon " + this.weapon.getName() + " can't be decorated with " + this.key);
        }
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

    @Override
    public Boolean isKey(final String key) {
        return this.key.equals(key) || this.weapon.isKey(key);
    }
}
