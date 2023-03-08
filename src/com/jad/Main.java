package com.jad;

import com.jad.herd.*;
import com.jad.herd.behavior.eat.EatBehavior;

public class Main {

    public static void main(String[] args) {
        Herd herd = new Herd();

        herd.addCow(new EnglishCow("Betsy"));
        herd.addCow(new FrenchCow("Berthe"));
        herd.addCow(new SpanishCow("Berta"));
        herd.addCow(new JapanCow("Bento"));

        herd.makeThemEat();
        herd.makeThemSpeak();

        herd.getCowByName("Berthe").setEatBehavior(herd.getCowByName("Bento").getEatBehavior());
        herd.getCowByName("Berta").setSpeakBehavior(herd.getCowByName("Berthe").getSpeakBehavior());
        herd.getCowByName("Betsy").setEatBehavior(new EatBehavior() {
            @Override
            public void eat() {
                System.out.println(this.getCow().getName() + " mange de l'herbe dans le pré en regardant le train passer");
            }
        });
        herd.getCowByName("Berta").setEatBehavior(herd.getCowByName("Betsy").getEatBehavior());
        herd.makeThemEat();
        herd.makeThemSpeak();

    }
}
