package com.jad.weapon.rule;

import com.jad.weapon.IWeapon;

public class Is extends WeaponRule {
    private final String key;

    public Is(final String key) {
        this.key = key;
    }

    @Override
    public boolean isSatisfiedBy(final IWeapon weapon) {
        return weapon.isKey(this.key);
    }
}
