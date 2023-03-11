package com.jad.weapon.rule;

import com.jad.weapon.IWeapon;

public class GoodBadQualityRule extends WeaponRule {
    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return new IsRule("BadQuality").not().and(new IsRule("GoodQuality").not()).isSatisfiedBy(weapon);
    }
}
