package com.jad.observer.cat;

import java.util.Random;

public enum CatState {
    Awake(" ^-^\n(o o) \n (    )"), Asleep(" ^-^\n(- -) \n (    )");

    private final String look;

    CatState(final String look) {
        this.look = look;
    }

    public String getLook() {
        return look;
    }

    public static CatState GetRandomState() {
        return new Random().nextInt(5) == 0 ? CatState.Awake : CatState.Asleep;
    }
}
