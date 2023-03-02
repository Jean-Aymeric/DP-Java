package com.jad.observer;

public abstract class AnimalThread extends Thread {
    private final int waitingTime;
    private boolean alive = true;

    protected AnimalThread(final int waitingTime) {
        this.waitingTime = waitingTime;
    }

    @Override
    public void run() {
        while(this.alive) {
            this.runExtended();
            System.out.println(this);
            try {
                Thread.sleep(this.waitingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract void runExtended();

    public final void die() {
        this.alive = false;
    }
}
