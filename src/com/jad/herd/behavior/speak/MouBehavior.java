package com.jad.herd.behavior.speak;

import com.jad.herd.behavior.CowBehavior;

public class MouBehavior extends CowBehavior implements SpeakBehavior{
    @Override
    public void speak() {
        System.out.println(this.getCow().getName() + " : Mou");
    }
}
