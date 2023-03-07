package com.jad;

import com.jad.weapon.Sword;
import com.jad.weapon.IWeapon;

public class Main {

    public static void main(String[] args) {
        IWeapon sword = new Sword();
        System.out.println(sword.attack());
    }
}
