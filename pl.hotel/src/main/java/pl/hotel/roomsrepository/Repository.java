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


    protected boolean isRoomInRepository(List <RoomAbstract> roomList, int roomNumber) {
        for (RoomAbstract roomAbstract : roomList) {
            if (roomAbstract.getRoomNumber() == roomNumber) {
                return true;
            }
        }
        return false;
    }
    ObjectMapper objectMapper = new ObjectMapper();

    public List readHotelRoomRepository() {

        List<HotelRoom> hotelRoomList = new ArrayList<>();

        try {
            File file = new File("src/main/resources/HotelRoomsRepository.json");
            hotelRoomList = objectMapper.readValue(file, new TypeReference<List<HotelRoom>>() {});
            return hotelRoomList;

        } catch (IOException e) {
            if (e.getClass().getSimpleName().toString().equals("MismatchedInputException")) {
                System.out.println("Brak pokoi hotelowych w bazie");

            } else {
                e.printStackTrace();
                System.out.println("Something wrong with HotelRoomsRepository.json");
            }

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
                if (e.getClass().getSimpleName().toString().equals("MismatchedInputException")) {
                    System.out.println("Brak domków letniskowych w bazie");
                } else {
                    e.printStackTrace();
                    System.out.println("Something wrong with HolidayCottageRepository.json");
                }


                return holidayCottageList;
            }
        }



}
