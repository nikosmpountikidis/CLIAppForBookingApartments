package Model.Rooms;

/**This class represents a Hotel and inherits the features of
 * the RoomsModel class*/

public class HotelModel extends RoomsModel{
    private static final String hotel = "Hotel";
    private String pool;
    private String dinner;
    private String roomService;
    private String parking;
    private String roofGarden;

    /**Setters and Getters for the variables of this class
     * Setters change the current value of a variable
     * with a new one*/

    public void setPool(String pool) {
        this.pool = pool;
    }
    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
    public void setRoomService(String roomService) {
        this.roomService = roomService;
    }
    public void setParking(String parking) {
        this.parking = parking;
    }
    public void setRoofGarden(String roofGarden) {
        this.roofGarden = roofGarden;
    }

    /**Getters return the new value*/
    public String getHotel(){
        return hotel;}
    public String getPool() {
        return pool;
    }
    public String getDinner() {
        return dinner;
    }
    public String getRoomService() {
        return roomService;
    }
    public String getParking() {
        return parking;
    }
    public String getRoofGarden() {
        return roofGarden;
    }
}
