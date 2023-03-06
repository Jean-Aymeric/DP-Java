package com.jad.observer.mouse;

import com.jad.observer.AnimalThread;
import com.jad.observer.House;
import com.jad.observer.Observable;
import com.jad.observer.Observer;

public class Mouse extends AnimalThread implements Observer {
    private final static int WaitingTime = 1000;

    private MouseState state;
    private final House house;

    public Mouse(final House house) {
        super(Mouse.WaitingTime);
        this.house = house;
        this.state = MouseState.Hidden;
        this.house.getCat().addObserver(this);
    }

    @Override
    public String toString() {
        return this.getId() + " : " + this.state.getLook();
    }

    @Override
    protected void runExtended() {
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

    @Override
    public void update(final Observable observable) {
        if (this.house.getCat().isAwake()) {
            this.hide();
        } else {
            this.dance();
        }
    }
}
