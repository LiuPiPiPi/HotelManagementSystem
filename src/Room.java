public class Room {
    private int floorNum;
    private int roomNum;
    private final String[] roomType = new String[]{
            "Large room with double beds",
            "Large room with a large single bed",
            "Small room with a single bed",
            "VIP room"};

    public int getFloorNum() {
        return floorNum;
    }

    public void setFloorNum(int floorNum) {
        this.floorNum = floorNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String toString(int floor, int room) {
        return "Room " + floor + room +
                ": " + roomType[0]; // TODO
    }
}
