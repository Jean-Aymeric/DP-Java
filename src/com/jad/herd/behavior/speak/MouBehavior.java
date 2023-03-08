package com.jad.herd.behavior.speak;

public class MouBehavior extends SpeakBehavior{
    @Override
    public void speak() {
        System.out.println(this.getCow().getName() + " : Mou");
    }
}
