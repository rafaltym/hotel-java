package pl.hotel.rooms;

public class HotelRoom extends RoomAbstract {
    public HotelRoom(boolean dishes, boolean kitchenette, boolean terrace, int numberOfRooms, int numberOfGuests, int price) {
        super(dishes, kitchenette, true, terrace, false, false, numberOfRooms, numberOfGuests, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
