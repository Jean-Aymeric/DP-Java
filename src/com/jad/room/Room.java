package com.jad.room;

import com.jad.heating.Heating;
import com.jad.heating.HeatingType;
import com.jad.hifi.Hifi;
import com.jad.homecinema.HomeCinema;
import com.jad.light.Light;

public class Room {
    private final String name;
    private final Light light = new Light();
    private final Heating heating;
    private Hifi hifi = null;
    private HomeCinema homeCinema = null;

    public Room(final String name, final HeatingType heatingType) {
        this.name = name;
        this.heating = new Heating(name, heatingType);
    }

    public String getName() {
        return this.name;
    }

    public Light getLight() {
        return this.light;
    }

    public Heating getHeating() {
        return this.heating;
    }

    public Hifi getHifi() {
        return hifi;
    }

    public void setHifi(final Hifi hifi) {
        this.hifi = hifi;
    }

    public HomeCinema getHomeCinema() {
        return homeCinema;
    }

    public void setHomeCinema(final HomeCinema homeCinema) {
        this.homeCinema = homeCinema;
    }
}
