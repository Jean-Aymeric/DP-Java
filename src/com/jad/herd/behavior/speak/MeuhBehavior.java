package com.jad.herd.behavior.speak;

public class MeuhBehavior extends SpeakBehavior{
    @Override
    public void speak() {
        System.out.println(this.getCow().getName() + " : Meuh");
    }
}
