package com.jad.light;

public class Light {
    private boolean on = false;
    private int brightness = 0;

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else {
            this.brightness = Math.min(brightness, 100);
        }
    }

    public boolean isOn() {
        return this.on;
    }

    public boolean isOff() {
        return ! this.on;
    }

    public int getBrightness() {
        return this.brightness;
    }
}
