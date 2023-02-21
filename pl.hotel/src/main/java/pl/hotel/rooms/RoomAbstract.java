package pl.hotel.rooms;

public abstract class RoomAbstract {
    private boolean shower = true;
    private boolean toilet = true;
    private boolean TV = true;
    private boolean parking = true;
    private boolean dishes;
    private boolean kitchenette;
    private boolean towels;
    private boolean terrace;
    private boolean grill;
    private boolean airConditioning;
    private int numberOfRooms;
    private int numberOfGuests;
    private int price;

    public RoomAbstract(boolean dishes, boolean kitchenette, boolean towels, boolean terrace, boolean grill,
                        boolean airConditioning, int numberOfRooms, int numberOfGuests, int price) {
        this.dishes = dishes;
        this.kitchenette = kitchenette;
        this.towels = towels;
        this.terrace = terrace;
        this.grill = grill;
        this.airConditioning = airConditioning;
        this.numberOfRooms = numberOfRooms;
        this.numberOfGuests = numberOfGuests;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "shower=" + shower +
                ", toilet=" + toilet +
                ", TV=" + TV +
                ", parking=" + parking +
                ", dishes=" + dishes +
                ", kitchenette=" + kitchenette +
                ", towels=" + towels +
                ", terrace=" + terrace +
                ", grill=" + grill +
                ", airConditioning=" + airConditioning +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfGuests=" + numberOfGuests +
                ", price=" + price +
                '}';
    }
}
