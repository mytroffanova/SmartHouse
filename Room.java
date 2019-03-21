package smarthouse;

import smarthouse.enums.RoomsStatus;

public class Room {

    private RoomsStatus status;
    private final int area;

    public Room(int area) {
        this.area = area;
    }

    public RoomsStatus getStatus() {
        return status;
    }

    public void setStatus(RoomsStatus status) {
        this.status = status;
    }

    public int getArea() {
        return area;
    }

}
