package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;
import com.jad.weapon.rule.GoodBadQualityRule;

public class GoodQuality extends AbstractWeaponDecorator {
    public GoodQuality(final IWeapon weapon) {
        super(weapon, "GoodQuality", new GoodBadQualityRule());
    }

    @Override
    public String getDecoratedName() {
        return " de bonne qualité";
    }

    @Override
    public int getDecoratedDamage() {
        return 1;
    }
}
