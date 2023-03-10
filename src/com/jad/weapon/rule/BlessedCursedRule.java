package com.jad.weapon.rule;

import com.jad.compositespecification.Specification;
import com.jad.weapon.IWeapon;

public class BlessedCursedRule extends WeaponRule {
    private static final Specification<IWeapon> Rule = new Is("Cursed").not().and(new Is("Blessed").not());

    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return BlessedCursedRule.Rule.isSatisfiedBy(weapon);
    }
}
