package Controller.Rooms;
import Model.Rooms.HotelModel;
import View.Rooms.HotelView;
import Controller.Parser;


public class HotelController extends RoomsController {
    private HotelModel model;
    private HotelView view;
    private Parser parser = new Parser();


    public HotelController(HotelModel model, HotelView view) {
        super(model,view);
        this.model = model;
        this.view = view;
    }


    public void setPool() {
        System.out.println("Does the Hotel include pool(Yes or No)?");
        model.setPool(parser.stringParser());
        while (!parser.checkString(model.getPool())){
            setPool();
        }
    }
    public void setDinner() {
        System.out.println("Does the Hotel include dinner(Yes or No)?");
        model.setDinner(parser.stringParser());
        while (!parser.checkString(model.getDinner())){
            setDinner();
        }
    }
    public void setRoomService() {
        System.out.println("Does the Hotel include room service(Yes or No)?");
        model.setRoomService(parser.stringParser());
        while (!parser.checkString(model.getRoomService())){
            setRoomService();
        }
    }
    public void setParking() {
        System.out.println("Is there a private parking(Yes or No)?");
        model.setParking(parser.stringParser());
        while (!parser.checkString(model.getParking())){
            setParking();
        }
    }
    public void setRoofGarden() {
        System.out.println("Does the Hotel include roof garden(Yes or No)?");
        model.setRoofGarden(parser.stringParser());
        while (!parser.checkString(model.getRoofGarden())){
            setRoofGarden();
        }
    }

    @Override
    public void updateView() {
        view.printHotelDetails(model.getName(),model.getHotel(),model.getPrice(),model.getCountry(),model.getCity(),
                model.getStreetAddress(),model.getStreetAddressNumber(),model.getSingleBed(),model.getDoubleBed(),
                model.getBalconies(),model.getRoomView(), model.getBathrooms(),model.getWifi(),model.getM2(),
                model.getDinner(),model.getPool(), model.getRoomService(),model.getParking(),model.getRoofGarden());
    }
    public HotelController createHotel(){
        HotelModel model = new HotelModel();
        HotelView view = new HotelView();
        HotelController controller = new HotelController(model,view);
        System.out.println("Please enter the details of the hotel");
        super.createRoom();
        setPool();
        setDinner();
        setRoomService();
        setParking();
        setRoofGarden();
        return controller;
    }
}
