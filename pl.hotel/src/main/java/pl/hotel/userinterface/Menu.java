package pl.hotel.userinterface;

import pl.hotel.rooms.HolidayCottage;
import pl.hotel.rooms.HotelRoom;
import pl.hotel.roomsrepository.Repository;
import pl.hotel.roomsrepository.RoomAdd;
import pl.hotel.roomsrepository.RoomDelete;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private Repository repository = new Repository();
    private RoomAdd roomAdd = new RoomAdd();
    public void menu() {

        boolean exit = false;
        while (!exit) {


            System.out.println("---------Hotel Mazury----------");
            System.out.println("-------------------------------");
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("1. Wyświetl listę pokoi hotelowych");
            System.out.println("2. Wyświetl listę domków letniskowych");
            System.out.println("3. Dodaj pokój hotelowy");
            System.out.println("4. Dodaj dom letniskowy");
            System.out.println("5. Dokonaj zmian w spisie pokoi");
            System.out.println("9. Wyjście");

            System.out.println("--------------------------------");

            String in = sc.next();

            switch (in) {
                case "1":
                    System.out.println(repository.readHotelRoomRepository().toString());
                    break;

                case "2":
                    System.out.println(repository.readHolidayCottageRepository().toString());
                    break;

                case "3":
                    addHotelRoom();
                    break;

                case "4":
                    addHolidayCottage();
                    break;

                case "5":
                    changeRoomList();
                    break;
                case "9":
                    sc.close();
                    exit = true;
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję!");
            }
        }

    }

    private void addHotelRoom() {
        System.out.println("Czy są naczynia w pokoju? (true/false)");
        boolean dishes = Boolean.valueOf(sc.next());
        System.out.println("Czy jest aneks kuchenny? (true/false)");
        boolean kitchenette = Boolean.valueOf(sc.next());
        System.out.println("Czy jest taras? (true/false)");
        boolean terrace = Boolean.valueOf(sc.next());
        System.out.println("Liczba pokoi: ");
        int numberOfRooms = sc.nextInt();
        System.out.println("Liczba miejsc: ");
        int numberOfGuests = sc.nextInt();
        System.out.println("Cena: ");
        int price = sc.nextInt();
        System.out.println("Nr pokoju: ");
        int roomNumber = sc.nextInt();
        roomAdd.roomAdd(new HotelRoom(dishes, kitchenette, terrace, numberOfRooms, numberOfGuests, price, roomNumber));
    }

    private void addHolidayCottage() {
        System.out.println("Czy jest klimatyzacja? (true/false)");
        boolean airConditioning = Boolean.valueOf(sc.next());
        System.out.println("Liczba pokoi: ");
        int numberOfRooms = sc.nextInt();
        System.out.println("Liczba miejsc: ");
        int numberOfGuests = sc.nextInt();
        System.out.println("Cena: ");
        int price = sc.nextInt();
        System.out.println("Nr pokoju: ");
        int roomNumber = sc.nextInt();
        roomAdd.roomAdd(new HolidayCottage(airConditioning,numberOfRooms, numberOfGuests, price, roomNumber));
    }

    private void changeRoomList() {
        System.out.println("1. Usuń pokój");
        System.out.println("2. Usuń domek letniskowy");
        RoomDelete roomDelete = new RoomDelete();
        if(sc.next().equals("1")) {
            System.out.println("Podaj nr pokoju do usunięcia: ");
            int roomNumber = sc.nextInt();
            roomDelete.roomDelete("HotelRoom", roomNumber);
        }   else if (sc.next().equals("2")) {
            System.out.println("Podaj nr pokoju do usunięcia: ");
            int roomNumber = sc.nextInt();
            roomDelete.roomDelete("HolidayCottage", roomNumber);
        }
    }

}
