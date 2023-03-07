package com.jad.house;

import com.jad.house.room.Room;

import java.util.ArrayList;

public class HouseFacade implements IHouse {
    private final House house = new House();

    @Override
    public void addRoom(final Room room) {
        this.house.addRoom(room);
    }

    @Override
    public ArrayList<Room> getRooms() {
        return this.house.getRooms();
    }

    @Override
    public Room getRoom(final String name) {
        return this.house.getRoom(name);
    }

    @Override
    public void removeRoom(final Room room) {
        this.house.removeRoom(room);
    }

    @Override
    public void removeRoom(final String name) {
        this.house.removeRoom(name);
    }

    public void turnOffAll() {
        this.turnOffAllLights();
        this.turnOffAllHifis();
        this.turnOffAllHeaters();
        this.turnOffAllHomeCinemas();
    }

    public void turnOnAllLights() {
        for (final Room room : this.house.getRooms()) {
            room.getLight().turnOn();
        }
    }

    public void turnOffAllLights() {
        for (final Room room : this.house.getRooms()) {
            room.getLight().turnOff();
        }
    }

    public void turnOnAllHifis() {
        this.turnOffAllHomeCinemas();
        for (final Room room : this.house.getRooms()) {
            if (room.getHifi() != null) {
                room.getHifi().setVolume(40);
            }
        }
    }

    public void turnOffAllHifis() {
        for (final Room room : this.house.getRooms()) {
            if (room.getHifi() != null) {
                room.getHifi().setVolume(0);
            }
        }
    }

    public void turnOnAllHeaters() {
        for (final Room room : this.house.getRooms()) {
            room.getHeating().turnOn();
        }
    }

    public void turnOffAllHeaters() {
        for (final Room room : this.house.getRooms()) {
            room.getHeating().turnOff();
        }
    }

    public void turnOnAllHomeCinemas() {
        this.turnOffAllHifis();
        for (final Room room : this.house.getRooms()) {
            if (room.getHomeCinema() != null) {
                room.getHomeCinema().turnOn();
            }
        }
    }

    public void turnOffAllHomeCinemas() {
        for (final Room room : this.house.getRooms()) {
            if (room.getHomeCinema() != null) {
                room.getHomeCinema().turnOff();
            }
        }
    }
}
