package pl.hotel.roomsrepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.hotel.rooms.HotelRoom;
import pl.hotel.rooms.RoomAbstract;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoomAdd extends Repository{
    public void roomAdd(RoomAbstract room){

        List<RoomAbstract> roomList;
        if(room.getClass() == HotelRoom.class) {
            roomList= readHotelRoomRepository();
        } else {
            roomList= readHolidayCottageRepository();
        }



//is being done when there is no similar room in repository
        if(!isRoomInRepository(roomList, room.getRoomNumber())) {
            try {
                FileWriter fileWriter;
                if(room.getClass() == HotelRoom.class){
                    fileWriter = new FileWriter("src/main/resources/HotelRoomsRepository.json", false);
                } else {
                    fileWriter = new FileWriter("src/main/resources/HolidayCottageRepository.json", false);
                }

                roomList.add(room);
                ObjectMapper mapper = new ObjectMapper();
                fileWriter.write(mapper.writeValueAsString(roomList));

                fileWriter.close();
                System.out.println("Added successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("There is already the room with the same number in the repository");
        }
    }

}
