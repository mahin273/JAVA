import java.util.*;
public class Hotel {
    private String name;
    private String address;
    private ArrayList<Room> rooms;
    private ArrayList<Guest> guests;
    private ArrayList<Reservation> reservations;

    public Hotel(String name, String address) {
        this.name = name;
        this.address = address;
        this.rooms = new ArrayList<>();
        this.guests = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    // Getters and setters for name and address

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Other methods to access rooms, guests, and reservations

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
}
