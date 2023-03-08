package com.jad.herd;

public class EnglishCow extends Cow {
    public EnglishCow(final String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " mange de l'herbe dans le pré");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " : Moo");
    }
}
