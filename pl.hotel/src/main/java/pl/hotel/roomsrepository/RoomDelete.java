package pl.hotel.roomsrepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.hotel.rooms.HotelRoom;
import pl.hotel.rooms.RoomAbstract;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RoomDelete extends Repository{

    List<RoomAbstract> roomList;
    public void roomDelete (String whichRoom, int roomNumber) {

        int roomToDelete = -1;
        roomList = roomListMethod(whichRoom);

        if(isRoomInRepository(roomList, roomNumber)) {
            try {
                FileWriter fileWriter;
                if(roomList.get(0).getClass() == HotelRoom.class){
                    fileWriter = new FileWriter("src/main/resources/HotelRoomsRepository.json", false);
                } else {
                    fileWriter = new FileWriter("src/main/resources/HolidayCottageRepository.json", false);
                }
                for (RoomAbstract room : roomList) {
                    if (room.getRoomNumber() == roomNumber) {
                        roomToDelete = roomList.indexOf(room);
                        System.out.println("Pokój o numerze " + roomNumber + " został usunięty.");
                    }
                }
                if(roomToDelete >= 0){
                    roomList.remove(roomToDelete);
                }
                ObjectMapper mapper = new ObjectMapper();
                fileWriter.write(mapper.writeValueAsString(roomList));

                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Pokój o takim numerze nie istnieje!");
        }

    }

    private List<RoomAbstract> roomListMethod(String whichRoom) {

        if (whichRoom.equals("HotelRoom")) {
            return readHotelRoomRepository();
        } else {
            return readHolidayCottageRepository();
        }
    }


}
