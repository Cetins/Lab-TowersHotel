public enum RoomType {
    SINGLE(1, 80),
    DOUBLE(2, 100),
    TRIPLE(3, 120),
    FAMILY(4, 130),
    MEETING(50, 1200);

    private final int value;
    private final int rate;

    RoomType(int value, int rate) {
        this.value = value;
        this.rate = rate;
    }

    public int getValue() {
        return value;
    }
    public int getRate() {
        return rate;
    }


}
