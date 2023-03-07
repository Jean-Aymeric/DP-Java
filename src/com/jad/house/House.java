package com.jad.house;

import com.jad.room.Room;

import java.util.ArrayList;

public class House {
    private final ArrayList<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(final Room room) {
        this.rooms.add(room);
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    public Room getRoom(final String name) {
        for (final Room room : this.rooms) {
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }

    public void removeRoom(Room room) {
        this.rooms.remove(room);
    }

    public void removeRoom(String name) {
        this.rooms.remove(this.getRoom(name));
    }
}
