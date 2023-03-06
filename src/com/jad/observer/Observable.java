package com.jad.observer;

import java.util.ArrayList;

public class Observable {
    private final ArrayList<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }
}
