package com.jad.observer.cat;

import com.jad.observer.AnimalThread;
import com.jad.observer.House;
import com.jad.observer.mouse.Mouse;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Cat extends AnimalThread {
    private final static int WaitingTime = 5000;

    private CatState state;
    private final House house;

    public Cat(House house) {
        super(Cat.WaitingTime);
        this.house = house;
        this.state = CatState.Asleep;
    }
    @Override
    public String toString() {
        return this.state.getLook();
    }

    @Override
    protected void runExtended() {
        this.state = CatState.GetRandomState();
        if (this.isAwake()) {
            for (Mouse mouse : this.house.getMice()) {
                if (! mouse.isHidden()) {
                    mouse.die();
                }
            }
        }
    }

    public boolean isAwake() {
        return this.state == CatState.Awake;
    }
}
