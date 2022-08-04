import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Room room;
    Guest guest;

    @Before
    public void before() {
        room = new Bedroom(RoomType.DOUBLE, 202);
        guest = new Guest("Jarrod");
    }

    @Test
    public void canAddGuest() {
        room.addGuest(guest);
        assertEquals(1, room.getGuestCount());
    }
}
