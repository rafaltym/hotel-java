package pl.hotel.roomsrepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.hotel.rooms.HotelRoom;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RoomAdd extends Repository{
    public void roomAdd(HotelRoom room){

        List<HotelRoom> roomList= readRoomRepository();


//is being done when there is no similar room in repository
        if(!isRoomInRepository(roomList, room)) {
            try {
                FileWriter fileWriter = new FileWriter("src/main/resources/RoomsRepository.json", false);
                roomList.add(room);
                ObjectMapper mapper = new ObjectMapper();
                fileWriter.write(mapper.writeValueAsString(roomList));

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("There is already the same room in the repository");
        }
    }

}
