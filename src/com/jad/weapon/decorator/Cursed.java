package com.jad.weapon.decorator;

import com.jad.weapon.AttackType;
import com.jad.weapon.IWeapon;
import com.jad.weapon.rule.BlessedCursedRule;

public class Cursed extends AbstractWeaponDecorator {
    public Cursed(final IWeapon weapon) {
        super(weapon, "Cursed", new BlessedCursedRule());
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
