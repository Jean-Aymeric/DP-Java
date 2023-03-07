package com.jad.weapon.decorator;

import com.jad.weapon.AttackType;
import com.jad.weapon.IWeapon;

public class Cursed extends AbstractWeaponDecorator {
    public Cursed(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDecoratedName() {
        return " maudit";
    }

    @Override
    public int getDecoratedDamage() {
        return 2;
    }

    @Override
    public AttackType getDecoratedAttackType() {
        return AttackType.Magic;
    }
}
