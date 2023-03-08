package com.jad.herd.behavior.eat;

public class InThePastureBehavior extends EatBehavior {
    @Override
    public void eat() {
        System.out.println(this.getCow().getName() + " mange de l'herbe dans le pré");
    }
}
