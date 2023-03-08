package com.jad;

import com.jad.herd.*;

public class Main {

    public static void main(String[] args) {
        Herd herd = new Herd();

        herd.addCow(new EnglishCow("Betsy"));
        herd.addCow(new FrenchCow("Berthe"));
        herd.addCow(new SpanishCow("Berta"));
        herd.addCow(new JapanCow("Bento"));

        herd.makeThemEat();
        herd.makeThemSpeak();
    }
}
