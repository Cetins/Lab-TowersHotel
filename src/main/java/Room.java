import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guestList;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guestList = new ArrayList<>();
    }

    public void setGuestList(ArrayList<Guest> guestList) {
        this.guestList = guestList;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getRoomCapacity() {
        return roomType.getValue();
    }

    public void addGuest(Guest newGuest) {
        this.guestList.add(newGuest);
    }

    public int getGuestCount() {
        return guestList.size();
    }

}
