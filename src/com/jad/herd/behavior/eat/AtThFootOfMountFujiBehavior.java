package com.jad.herd.behavior.eat;

import com.jad.herd.behavior.CowBehavior;

public class AtThFootOfMountFujiBehavior extends CowBehavior implements EatBehavior{
    @Override
    public void eat() {
        System.out.println(this.getCow().getName() + " mange de l'herbe au pied du mont Fuji");
    }
}
