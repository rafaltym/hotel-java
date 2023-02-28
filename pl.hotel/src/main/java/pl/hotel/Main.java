package pl.hotel;

import pl.hotel.rooms.HolidayCottage;
import pl.hotel.rooms.HotelRoom;
import pl.hotel.roomsrepository.Repository;
import pl.hotel.roomsrepository.RoomAdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        RoomAdd roomAdd = new RoomAdd();
        roomAdd.roomAdd(new HotelRoom(false, false,false, 1, 2, 240, 24));
        roomAdd.roomAdd(new HotelRoom(false, false,false, 1, 2, 200, 23));
        roomAdd.roomAdd(new HotelRoom(false, false,true, 2, 4, 400, 29));


    }
}