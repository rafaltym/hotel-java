package pl.hotel.roomsrepository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.hotel.rooms.HotelRoom;
import pl.hotel.rooms.RoomAbstract;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Repository {


    protected boolean isRoomInRepository(List roomList, HotelRoom hotelRoom) {
        for (int i = 0; i < roomList.size(); i++) {
            if ( roomList.get(i).toString().equals(hotelRoom.toString())) {
                return true;
            }
        }
        System.out.println("debug msg false");
        return false;
    }


    protected List readRoomRepository() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<HotelRoom> hotelRoomList = new ArrayList<> ();

        try {
            File file = new File ("src/main/resources/RoomsRepository.json");
            hotelRoomList = objectMapper.readValue(file , new TypeReference<List<HotelRoom>>() {});
            return hotelRoomList;

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something wrong with RoomsRepository.json");
            return hotelRoomList;
        }
    }



}
