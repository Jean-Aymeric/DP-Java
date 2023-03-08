package com.jad.herd;

public class SpanishCow extends Cow {
    public SpanishCow(final String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " mange de l'herbe dans le pré");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + " : Muuu");
    }
}
