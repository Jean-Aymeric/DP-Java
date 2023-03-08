package com.jad.herd;

public class JapanCow extends Cow {
    public JapanCow(final String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " mange de l'herbe au pied du mont Fuji");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " : Mou");
    }
}
