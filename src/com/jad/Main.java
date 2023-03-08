package com.jad;

import com.jad.herd.*;
import com.jad.herd.behavior.eat.AtThFootOfMountFujiBehavior;
import com.jad.herd.behavior.speak.MeuhBehavior;

public class Main {

    public static void main(String[] args) {
        Herd herd = new Herd();

        herd.addCow(new EnglishCow("Betsy"));
        herd.addCow(new FrenchCow("Berthe"));
        herd.addCow(new SpanishCow("Berta"));
        herd.addCow(new JapanCow("Bento"));

        herd.makeThemEat();
        herd.makeThemSpeak();

        herd.getCowByName("Berthe").setEatBehavior(new AtThFootOfMountFujiBehavior());
        herd.getCowByName("Berta").setSpeakBehavior(new MeuhBehavior());

        herd.makeThemEat();
        herd.makeThemSpeak();
    }
}
