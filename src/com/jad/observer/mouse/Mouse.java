package com.jad.observer.mouse;

import com.jad.observer.AnimalThread;

import java.util.Random;

public class Mouse extends AnimalThread {
    private final static int WaitingTime = 1000;

    private MouseState state;

    public Mouse() {
        super(Mouse.WaitingTime);
        this.state = MouseState.Hidden;
    }

    @Override
    public String toString() {
        return this.getId() + " : " + this.state.getLook();
    }

    @Override
    protected void runExtended() {

    }
}
