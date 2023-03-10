package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;
import com.jad.weapon.rule.GoodBadQualityRule;

public class BadQuality extends AbstractWeaponDecorator {
    public BadQuality(final IWeapon weapon) {
        super(weapon, "BadQuality", new GoodBadQualityRule());
    }

    @Override
    public String getDecoratedName() {
        return " de mauvaise qualité";
    }

    @Override
    public int getDecoratedDamage() {
        return -1;
    }
}
