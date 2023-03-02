package com.jad.observer.mouse;

import com.jad.observer.AnimalThread;
import com.jad.observer.House;

public class Mouse extends AnimalThread {
    private final static int WaitingTime = 100;

    private MouseState state;
    private final House house;

    public Mouse(final House house) {
        super(Mouse.WaitingTime);
        this.house = house;
        this.state = MouseState.Hidden;
    }

    @Override
    public String toString() {
        return this.getId() + " : " + this.state.getLook();
    }

    @Override
    protected void runExtended() {
        if (this.house.getCat().isAwake()) {
            this.hide();
        } else {
            this.dance();
        }
    }

    public void dance() {
        this.state = MouseState.Dancing;
    }

    public void hide() {
        this.state = MouseState.Hidden;
    }

    public boolean isHidden() {
        return this.state == MouseState.Hidden;
    }
}
