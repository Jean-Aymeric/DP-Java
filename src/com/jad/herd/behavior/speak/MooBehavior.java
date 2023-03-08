package com.jad.herd.behavior.speak;

public class MooBehavior extends SpeakBehavior{
    @Override
    public void speak() {
        System.out.println(this.getCow().getName() + " : Moo");
    }
}
