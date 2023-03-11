package com.jad.weapon.rule;

import com.jad.weapon.IWeapon;

public class DrenchedInDragonSBloodRule extends WeaponRule {
    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return new IsRule("DrenchedInDragonSBlood").not().and(new IsRule("Wand").not()).isSatisfiedBy(weapon);
    }
}
