package pl.hotel.rooms;



public class HolidayCottage extends RoomAbstract {
    public HolidayCottage() {
    }

    public HolidayCottage(boolean airConditioning, int numberOfRooms, int numberOfGuests, int price, int roomNumber) {
        super(true, true, false, true, true, airConditioning, numberOfRooms, numberOfGuests, price, roomNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void setShower(boolean shower) {
        super.setShower(shower);
    }

    @Override
    public void setToilet(boolean toilet) {
        super.setToilet(toilet);
    }

    @Override
    public void setTV(boolean TV) {
        super.setTV(TV);
    }

    @Override
    public void setParking(boolean parking) {
        super.setParking(parking);
    }

    @Override
    public void setDishes(boolean dishes) {
        super.setDishes(dishes);
    }

    @Override
    public void setKitchenette(boolean kitchenette) {
        super.setKitchenette(kitchenette);
    }

    @Override
    public void setTowels(boolean towels) {
        super.setTowels(towels);
    }

    @Override
    public void setTerrace(boolean terrace) {
        super.setTerrace(terrace);
    }

    @Override
    public void setGrill(boolean grill) {
        super.setGrill(grill);
    }

    @Override
    public void setAirConditioning(boolean airConditioning) {
        super.setAirConditioning(airConditioning);
    }

    @Override
    public void setNumberOfRooms(int numberOfRooms) {
        super.setNumberOfRooms(numberOfRooms);
    }

    @Override
    public void setNumberOfGuests(int numberOfGuests) {
        super.setNumberOfGuests(numberOfGuests);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setRoomNumber(int roomNumber) {
        super.setRoomNumber(roomNumber);
    }

    @Override
    public boolean isShower() {
        return super.isShower();
    }

    @Override
    public boolean isToilet() {
        return super.isToilet();
    }

    @Override
    public boolean isTV() {
        return super.isTV();
    }

    @Override
    public boolean isParking() {
        return super.isParking();
    }

    @Override
    public boolean isDishes() {
        return super.isDishes();
    }

    @Override
    public boolean isKitchenette() {
        return super.isKitchenette();
    }

    @Override
    public boolean isTowels() {
        return super.isTowels();
    }

    @Override
    public boolean isTerrace() {
        return super.isTerrace();
    }

    @Override
    public boolean isGrill() {
        return super.isGrill();
    }

    @Override
    public boolean isAirConditioning() {
        return super.isAirConditioning();
    }

    @Override
    public int getNumberOfRooms() {
        return super.getNumberOfRooms();
    }

    @Override
    public int getNumberOfGuests() {
        return super.getNumberOfGuests();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public int getRoomNumber() {
        return super.getRoomNumber();
    }
}
