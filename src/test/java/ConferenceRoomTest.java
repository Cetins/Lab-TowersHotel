import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    Room room;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        room = new ConferenceRoom(RoomType.MEETING, "Meeting Hall");
        guest1 = new Guest("John");
        guest2 = new Guest("Jarrod");
    }

    @Test
    public void canAddMultipleGuests() {
        room.addGuest(guest1);
        room.addGuest(guest2);
        assertEquals(2, room.getGuestCount());
    }
}
