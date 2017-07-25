package ui.main;

public class Rooms {

    private String room;
    private String floor;
    private boolean available;
    private String utilities;
    private boolean photos;
    private int stars;

    public Rooms(String floor, String room, boolean available, String utilities, boolean photos, int stars) {
        this.floor = floor;
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public String getFloor() {
        return floor;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getUtilities() {
        return utilities;
    }

    public boolean isPhotos() {
        return photos;
    }

    public int getStars() {
        return stars;
    }
}
