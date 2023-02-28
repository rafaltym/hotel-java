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
    private int roomNumber;

    public RoomAbstract() {
    }

    public RoomAbstract(boolean dishes, boolean kitchenette, boolean towels, boolean terrace, boolean grill,
                        boolean airConditioning, int numberOfRooms, int numberOfGuests, int price, int roomNumber) {
        this.dishes = dishes;
        this.kitchenette = kitchenette;
        this.towels = towels;
        this.terrace = terrace;
        this.grill = grill;
        this.airConditioning = airConditioning;
        this.numberOfRooms = numberOfRooms;
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "RoomAbstract{" +
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
                ", roomNumber=" + roomNumber +
                '}';
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }

    public void setToilet(boolean toilet) {
        this.toilet = toilet;
    }

    public void setTV(boolean TV) {
        this.TV = TV;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setDishes(boolean dishes) {
        this.dishes = dishes;
    }

    public void setKitchenette(boolean kitchenette) {
        this.kitchenette = kitchenette;
    }

    public void setTowels(boolean towels) {
        this.towels = towels;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public void setGrill(boolean grill) {
        this.grill = grill;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isShower() {
        return shower;
    }

    public boolean isToilet() {
        return toilet;
    }

    public boolean isTV() {
        return TV;
    }

    public boolean isParking() {
        return parking;
    }

    public boolean isDishes() {
        return dishes;
    }

    public boolean isKitchenette() {
        return kitchenette;
    }

    public boolean isTowels() {
        return towels;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public boolean isGrill() {
        return grill;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
