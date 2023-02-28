package pl.hotel.roomsrepository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.hotel.rooms.HolidayCottage;
import pl.hotel.rooms.HotelRoom;
import pl.hotel.rooms.RoomAbstract;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Repository {


    protected boolean isRoomInRepository(List <RoomAbstract> roomList, RoomAbstract hotelRoom) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getRoomNumber() == hotelRoom.getRoomNumber()) {
                return true;
            }
        }
        return false;
    }
    ObjectMapper objectMapper = new ObjectMapper();

    public List readHotelRoomRepository() {

        List<HotelRoom> hotelRoomList = new ArrayList<>();

        try {
            File file = new File("src/main/resources/RoomsRepository.json");
            hotelRoomList = objectMapper.readValue(file, new TypeReference<List<HotelRoom>>() {});
            return hotelRoomList;

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something wrong with RoomsRepository.json");
            return hotelRoomList;
        }
    }
        public List readHolidayCottageRepository () {
            List<HolidayCottage> holidayCottageList = new ArrayList<>();

            try {
                File file = new File("src/main/resources/HolidayCottageRepository.json");
                holidayCottageList = objectMapper.readValue(file, new TypeReference<List<HolidayCottage>>() {
                });
                return holidayCottageList;

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Something wrong with HolidayCottageRepository.json");
                return holidayCottageList;
            }
        }



}
