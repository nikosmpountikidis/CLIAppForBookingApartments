package Controller.Rooms;

import Controller.Parser;

import Model.Rooms.RoomsModel;
import View.Rooms.RoomsView;
/**RoomsController is a class with common features. We are going to use this class
 * in other classes to insert its information*/
public class RoomsController {
    private RoomsModel model;
    private RoomsView view;
    private Parser parser = new Parser();

    public RoomsController(RoomsModel model, RoomsView view) {
        this.model = model;
        this.view = view;

    }
    public void setRoomId() {
        System.out.println("Room ID:");
        model.setRoomId(parser.intParser());

    }
    public void setPrice(){
        System.out.println("Enter the price: ");
        model.setPrice(parser.intParser());
    }
    public void setName(){
        System.out.println("Name: ");
        model.setName(parser.stringParser());
        while (!parser.checkString(model.getName())){
            setName();
        }
    }
    public void setCountry() {

        System.out.println("How many single beds:");
        model.setSingleBed(parser.stringParser());
        while (!parser.checkString(model.getCountry())){
            setCountry();
        }
    }
    public void setCity() {
        System.out.println("How many single beds:");
        model.setSingleBed(parser.stringParser());
        while (!parser.checkString(model.getCity())){
            setCity();
        }
    }
    public void setStreetAddress() {
        System.out.println("How many single beds:");
        model.setStreetAddress(parser.stringParser());
        while (!parser.checkString(model.getStreetAddress())){
            setStreetAddress();
        }
    }
    public void setStreetAddressNumber() {
        System.out.println("How many single beds:");
        model.setStreetAddressNumber(parser.stringParser());
        while (!parser.checkString(model.getStreetAddressNumber())){
            setStreetAddressNumber();
        }
    }
    public void setSingleBed() {
        System.out.println("How many single beds:");
        model.setSingleBed(parser.stringParser());
        while (!parser.checkString(model.getSingleBed())){
            setSingleBed();
        }
    }
    public void setDoubleBed() {
        System.out.println("How many double beds:");
        model.setDoubleBed(parser.stringParser());
        while (!parser.checkString(model.getDoubleBed())){
            setDoubleBed();
        }
    }
    public void setBalconies() {
        System.out.println("How many balconies:");
        model.setBalconies(parser.stringParser());
        while (!parser.checkString(model.getBalconies())){
            setBalconies();
        }
    }
    public void setRoomView() {
        System.out.println("What is the view:");
        model.setRoomView(parser.stringParser());
        while (!parser.checkString(model.getRoomView())){
            setRoomView();
        }
    }
    public void setBathrooms() {
        System.out.println("How many bathrooms:");
        model.setBathrooms(parser.stringParser());
        while (!parser.checkString(model.getBathrooms())){
            setBathrooms();
        }
    }
    public void setWifi() {
        System.out.println("Is there wifi(Yes or No)?");
        model.setWifi(parser.stringParser());
        while (!parser.checkString(model.getWifi())){
            setWifi();
        }
    }
    public void setM2() {
        System.out.println("How many m2?");
        model.setM2(parser.stringParser());
        while (!parser.checkString(model.getM2())){
            setM2();
        }
    }
    public String getName(){
        return model.getName();
    }
    public int getPrice(){
        return model.getPrice();
    }
    public void createRoom(){
        setName();
        setPrice();
        setCountry();
        setCity();
        setStreetAddress();
        setStreetAddressNumber();
        setSingleBed();
        setDoubleBed();
        setBalconies();
        setRoomView();
        setBathrooms();
        setWifi();
        setM2();
    }

    public void updateView(){
        view.printRoomsDetails(model.getName(),model.getPrice(),model.getCountry(),model.getCity(),
                model.getStreetAddress(),model.getStreetAddressNumber(),model.getSingleBed(),model.getDoubleBed(),
                model.getBalconies(),model.getView(), model.getBathrooms(),model.getWifi(),model.getM2());
    }
}
