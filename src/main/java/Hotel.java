import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void checkInBedroom(Guest guestIn, Bedroom bedroom) {
        int index = bedrooms.indexOf(bedroom);
        bedrooms.get(index).addGuest(guestIn);
    }

    public void checkOutBedroom(Bedroom bedroom) {
        int index = bedrooms.indexOf(bedroom);
        bedrooms.get(index).setGuestList(new ArrayList<>());
    }

    public Booking bookRoom(Room room, int nights) {
        Booking newBooking;
        newBooking = new Booking(room, nights);
        return newBooking;
    }

}
