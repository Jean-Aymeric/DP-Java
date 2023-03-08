package com.jad.herd.behavior.eat;

import com.jad.herd.behavior.CowBehavior;

public class InThePastureBehavior extends CowBehavior implements EatBehavior{
    @Override
    public void eat() {
        System.out.println(this.getCow().getName() + " mange de l'herbe dans le pré");
    }
}
