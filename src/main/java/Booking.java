import java.awt.print.Book;

public class Booking {
    private Room room;
    private int nights;

    public Booking(Room room, int nights) {
        this.room = room;
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }

    public Room getRoom() {
        return room;
    }
    public int getTotalRate() {
        return this.nights * this.room.getRoomType().getRate();
    }
}
