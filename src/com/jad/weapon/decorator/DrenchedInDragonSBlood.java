package com.jad.weapon.decorator;

import com.jad.weapon.AttackType;
import com.jad.weapon.IWeapon;

public class DrenchedInDragonSBlood extends AbstractWeaponDecorator {
    public DrenchedInDragonSBlood(final IWeapon weapon) {
        super(weapon);
    }

    @Override
    public String getDecoratedName() {
        return " trempée dans du sang de dragon";
    }

    @Override
    public int getDecoratedDamage() {
        return 5;
    }

    @Override
    public AttackType getDecoratedAttackType() {
        return AttackType.Poison;
    }
}
