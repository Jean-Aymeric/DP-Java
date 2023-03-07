package com.jad.weapon;

public enum AttackType {
    Sharp("Tranchant"), Blunt("Contondant"), Piercing("Perçant"), Magic("Magique"), Fire("Feu"), Ice("Glace"), Lightning("Eclair"), Poison("Poison");
    private final String name;

    AttackType(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
