package com.jad.observer;

public abstract class AnimalThread extends Thread {
    private final int waitingTime;

    protected AnimalThread(final int waitingTime) {
        this.waitingTime = waitingTime;
    }

    @Override
    public void run() {
        for(;;) {
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
}
