package Model.Rooms;
/**This class represents the basic features of a House and also inherits
 * RoomsModel's features*/

public class HouseModel extends RoomsModel{
    private static final String house = "House";
    private String yard;
    private String playRoom;
    private String loft;

    /**Setters and Getters for this class
     * Setters change the current value
     * with a new value*/

    public void setYard(String yard) {
        this.yard = yard;
    }
    public void setPlayRoom(String playRoom) {
        this.playRoom = playRoom;
    }
    public void setLoft(String loft) {
        this.loft = loft;
    }
    /**
     * Getters return the new value */

    public String getHouse(){
        return house;
    }
    public String getYard() {
        return yard;
    }
    public String getPlayRoom() {
        return playRoom;
    }
    public String getLoft() {
        return loft;
    }


}
