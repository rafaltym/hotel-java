package pl.hotel.rooms;



public class HolidayCottage extends RoomAbstract {

    public HolidayCottage(boolean airConditioning, int numberOfRooms, int numberOfGuests, int price) {
        super(true, true, false, true, true, airConditioning, numberOfRooms, numberOfGuests, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
