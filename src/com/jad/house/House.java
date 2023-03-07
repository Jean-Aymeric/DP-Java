package com.jad.house;

import com.jad.house.room.Room;

import java.util.ArrayList;

public class House implements IHouse {
    private final ArrayList<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }

    @Override
    public void addRoom(final Room room) {
        this.rooms.add(room);
    }

    @Override
    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    @Override
    public Room getRoom(final String name) {
        for (final Room room : this.rooms) {
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }

    @Override
    public void removeRoom(Room room) {
        this.rooms.remove(room);
    }

    @Override
    public void removeRoom(String name) {
        this.rooms.remove(this.getRoom(name));
    }
}
