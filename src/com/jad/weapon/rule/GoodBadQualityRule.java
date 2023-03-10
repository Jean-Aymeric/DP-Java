package com.jad.weapon.rule;

import com.jad.compositespecification.Specification;
import com.jad.weapon.IWeapon;

public class GoodBadQualityRule extends WeaponRule {
    private static final Specification<IWeapon> Rule = new Is("BadQuality").not().and(new Is("GoodQuality").not());

    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return GoodBadQualityRule.Rule.isSatisfiedBy(weapon);
    }
}
