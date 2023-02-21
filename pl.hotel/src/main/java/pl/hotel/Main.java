package pl.hotel;

import pl.hotel.rooms.HolidayCottage;
import pl.hotel.rooms.HotelRoom;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, HotelRoom> HotelRoomHashMap = new HashMap<>();
        HotelRoomHashMap.put(21, new HotelRoom(false, false, false, 1, 3, 330));
        HotelRoomHashMap.put(22, new HotelRoom(false, false,false, 1, 2, 240 ));
        HotelRoomHashMap.put(29, new HotelRoom(false, false, false, 2, 4, 480));

        HashMap<Integer, HolidayCottage> HolidayCottageHashMap = new HashMap<>();
        HolidayCottageHashMap.put(1, new HolidayCottage(false,2, 5, 420));
        HolidayCottageHashMap.put(7, new HolidayCottage(true, 3, 10, 800));

        System.out.println(HotelRoomHashMap);
        System.out.println();
        System.out.println(HolidayCottageHashMap);



    }
}