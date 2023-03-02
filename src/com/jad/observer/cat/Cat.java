package com.jad.observer.cat;

import com.jad.observer.AnimalThread;

public class Cat extends AnimalThread {
    private final static int WaitingTime = 5000;

    private CatState state;

    public Cat() {
        super(Cat.WaitingTime);
        this.state = CatState.Asleep;
    }

    @Override
    public String toString() {
        return this.state.getLook();
    }

    @Override
    protected void runExtended() {
        this.state = CatState.GetRandomState();
    }

    public boolean isAwake() {
        return this.state == CatState.Awake;
    }
}
