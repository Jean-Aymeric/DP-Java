package com.jad;

import com.jad.heating.HeatingType;
import com.jad.hifi.Hifi;
import com.jad.homecinema.HomeCinema;
import com.jad.house.House;
import com.jad.room.Room;

public class Main {

    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.addRoom(new Room("Cuisine", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Chambre à coucher", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Salon", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Salle à manger", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Salle de bain", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Toilettes", HeatingType.ELECTRIC));

        myHouse.getRoom("Salon").setHomeCinema(new HomeCinema("Méga écran géant"));
        myHouse.getRoom("Salon").setHifi(new Hifi("Méga son HiFi"));
        myHouse.getRoom("Cuisine").setHifi(new Hifi("Petite radio FM"));
        myHouse.getRoom("Salle de bain").setHifi(new Hifi("Enceinte bluetooth"));

    }
}
