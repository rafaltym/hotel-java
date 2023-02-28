package pl.hotel.userinterface;

import pl.hotel.rooms.HotelRoom;
import pl.hotel.roomsrepository.Repository;
import pl.hotel.roomsrepository.RoomAdd;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {


            System.out.println("---------Hotel Mazury----------");
            System.out.println("-------------------------------");
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("1. Wyświetl listę pokoi hotelowych");
            System.out.println("2. Wyświetl listę domków letniskowych");
            System.out.println("3. Dodaj pokój hotelowy");
            System.out.println("4. Dodaj dom letniskowy");
            System.out.println("5. Wyjście");

            System.out.println("--------------------------------");

            String in = sc.next();
            Repository repository = new Repository();
            RoomAdd roomAdd = new RoomAdd();
            switch (in) {
                case "1":
                    System.out.println(repository.readHotelRoomRepository().toString());
                    break;

                case "2":
                    System.out.println(repository.readHolidayCottageRepository().toString());
                    break;

                case "3":
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

                    break;

                case "5":
                    exit = true;
            }
        }

    }


}
