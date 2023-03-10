package com.jad;

import com.jad.weapon.decorator.*;
import com.jad.weapon.leaf.*;
import com.jad.weapon.IWeapon;

public class Main {

    public static void main(String[] args) {
        try {
            IWeapon sword = new Cursed(new DrenchedInDragonSBlood(new Sword()));
            IWeapon wand = new DrenchedInDragonSBlood(new Blessed(new BadQuality(new Wand())));
            IWeapon axe = new DrenchedInDragonSBlood(new GoodQuality(new Axe()));
            IWeapon dagger = new Blessed(new DrenchedInDragonSBlood(new BadQuality(new Dagger())));
            System.out.println(sword.attack());
            System.out.println(wand.attack());
            System.out.println(axe.attack());
            System.out.println(dagger.attack());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
