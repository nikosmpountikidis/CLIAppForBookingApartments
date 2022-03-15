package Controller.Rooms;
import Controller.Parser;
import Model.Rooms.HouseModel;
import View.Rooms.HotelView;
import View.Rooms.HouseView;
/**In this class there is a house with its features. Also inherits
 * features from RoomsController*/
public class HouseController extends RoomsController {

    private Parser parser = new Parser();
    private HouseModel model;
    private HouseView view;
/**A constructor to create a HouseController object with HouseModel and HouseView parameters*/
    public HouseController (HouseModel model,HouseView view) {
        super(model,view);
        this.model = model;
        this.view = view;
    }
    /**Here is some setters that ask for answers and then scan the answers*/
    public void setYard() {
        System.out.println("Does the house include yard(Yes ot No)?");
        model.setYard(parser.stringParser());
        while (!parser.checkString(model.getYard())){
            setYard();
        }
    }
    public void setPlayRoom() {
        System.out.println("Does the house include playroom(Yes ot No)?");
        model.setPlayRoom(parser.stringParser());
        while (!parser.checkString(model.getPlayRoom())){
            setPlayRoom();
        }
    }
    public void setLoft() {
        System.out.println("Does the house include loft(Yes ot No)?");
        model.setLoft(parser.stringParser());
        while (!parser.checkString(model.getLoft())){
            setLoft();
        }
    }
    @Override
    public void updateView(){
        view.printHouseDetails(model.getName(),model.getHouse(),model.getPrice(),model.getCountry(),model.getCity(),
                model.getStreetAddress(),model.getStreetAddressNumber(),model.getSingleBed(),model.getDoubleBed(),
                model.getBalconies(),model.getRoomView(), model.getBathrooms(),model.getWifi(),model.getM2(),
                model.getYard(),model.getPlayRoom(),model.getLoft());
    }
    public HouseController createHouse(){
        HouseModel model = new HouseModel();
        HouseView view = new HouseView();
        HouseController controller = new HouseController(model,view);
        super.createRoom();
        setYard();
        setPlayRoom();
        setLoft();
        return controller;
    }
}
