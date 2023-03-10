package com.jad.weapon.rule;

import com.jad.compositespecification.Specification;
import com.jad.weapon.IWeapon;

public class DrenchedInDragonSBloodRule extends WeaponRule {
    private static final Specification<IWeapon> Rule = new Is("DrenchedInDragonSBlood").not().and(new Is("Wand").not());

    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return DrenchedInDragonSBloodRule.Rule.isSatisfiedBy(weapon);
    }
}
