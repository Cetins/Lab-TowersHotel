import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

    @Before
    public void before() {
        room = new Bedroom(RoomType.SINGLE, 201);
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.SINGLE, room.getRoomType());
    }

    @Test
    public void canGetRoomCapacity() {
        assertEquals(1, room.getRoomCapacity());
    }
}
