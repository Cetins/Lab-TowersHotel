import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Room bedroom;
    Booking booking;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 202);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void canCalculateTotalRate() {
        assertEquals(300, booking.getTotalRate());
    }
}