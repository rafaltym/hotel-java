package pl.hotel.rooms;

public class HotelRoom extends RoomAbstract {
    public HotelRoom() {
    }


    public HotelRoom(boolean dishes, boolean kitchenette, boolean terrace, int numberOfRooms, int numberOfGuests, int price, int roomNumber) {
        super(dishes, kitchenette, true, terrace, false, false, numberOfRooms, numberOfGuests, price, roomNumber);
    }


}
