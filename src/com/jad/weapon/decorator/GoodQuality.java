package com.jad.weapon.decorator;

import com.jad.weapon.IWeapon;

public class GoodQuality extends AbstractWeaponDecorator {
    public GoodQuality(final IWeapon weapon) {
        super(weapon);
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
