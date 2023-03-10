package com.jad.weapon.decorator;

import com.jad.weapon.AttackType;
import com.jad.weapon.IWeapon;
import com.jad.weapon.rule.BlessedCursedRule;

public class Blessed extends AbstractWeaponDecorator {
    public Blessed(final IWeapon weapon) {
        super(weapon, "Blessed", new BlessedCursedRule());
    }

    @Override
    public String getDecoratedName() {
        return " béni";
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
