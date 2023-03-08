package com.jad.herd.behavior.speak;

import com.jad.herd.behavior.CowBehavior;

public class MeuhBehavior extends CowBehavior implements SpeakBehavior{
    @Override
    public void speak() {
        System.out.println(this.getCow().getName() + " : Meuh");
    }
}
