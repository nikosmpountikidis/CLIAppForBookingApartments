package Model.Rooms;

/**This class represents the features of a room*/

public class RoomsModel {
    private int roomId;
    private int price;
    private String name;
    private String country;
    private String city;
    private String streetAddress;
    private String streetAddressNumber;
    private String singleBed;
    private String doubleBed;
    private String balconies;
    private String roomView;
    private String bathrooms;
    private String bookingDate;
    private String availableDates;
    private String wifi;
    private String m2;

/** Setter and Getter from those features
 * Setters change the current value of the variable with
 * a new value.*/
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    public void setPrice(int price){this.price = price;}
    public void setName(String name) {
        this.name = name;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void setStreetAddressNumber(String streetAddressNumber) {
        this.streetAddressNumber = streetAddressNumber;
    }
    public void setSingleBed(String singleBed) {
        this.singleBed = singleBed;
    }
    public void setDoubleBed(String doubleBed) {
        this.doubleBed = doubleBed;
    }
    public void setBalconies(String balconies) {
        this.balconies = balconies;
    }
    public void setRoomView(String roomView) {
        this.roomView = roomView;
    }
    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }
    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
    public void setM2(String m2) {
        this.m2 = m2;
    }

    /**Getters return the new value.*/
    public int getRoomId() {
        return roomId;
    }
    public int getPrice(){return price;}
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public String getStreetAddressNumber() {
        return streetAddressNumber;
    }
    public String getSingleBed() {
        return singleBed;
    }
    public String getDoubleBed() {
        return doubleBed;
    }
    public String getBalconies() {
        return balconies;
    }
    public String getView() {
        return roomView;
    }
    public String getRoomView() {return roomView;}
    public String getBathrooms() {
        return bathrooms;
    }
    public String getWifi() {
        return wifi;
    }
    public String getM2() {
        return m2;
    }
}
