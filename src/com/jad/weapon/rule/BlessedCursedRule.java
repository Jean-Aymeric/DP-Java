package com.jad.weapon.rule;

import com.jad.weapon.IWeapon;

public class BlessedCursedRule extends WeaponRule {
    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return new IsRule("Cursed").not().and(new IsRule("Blessed").not()).isSatisfiedBy(weapon);
    }
}
