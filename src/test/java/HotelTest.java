import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;
    Booking booking;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE, 202);
        conferenceRoom = new ConferenceRoom(RoomType.MEETING, "Meeting Hall");
        guest1 = new Guest("John");
        guest2 = new Guest("Jarrod");
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canCheckInBedroom() {
        hotel.addBedroom(bedroom);
        hotel.checkInBedroom(guest1, bedroom);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void canCheckOutBedroom() {
        hotel.addBedroom(bedroom);
        hotel.checkInBedroom(guest1, bedroom);
        hotel.checkOutBedroom(bedroom);
        assertEquals(0, bedroom.getGuestCount());
    }

    @Test
    public void canBookRoom() {
        Booking testBooking = new Booking(bedroom, 3);
        assertEquals(bedroom, testBooking.getRoom());
        assertEquals(3, testBooking.getNights());
    }


}
