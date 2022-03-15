package Model;
import Controller.Rooms.HotelController;
import Controller.Rooms.HouseController;
import Controller.Rooms.RoomsController;
import Model.Rooms.HotelModel;
import Model.Rooms.HouseModel;
import View.Rooms.HotelView;
import View.Rooms.HouseView;
import java.util.ArrayList;

public class RoomData {
    private ArrayList<RoomsController> rooms = new ArrayList<>();

    public HotelController updateHotelController1(){
        HotelModel hotelModel = new HotelModel();
        HotelView hotelView = new HotelView();
        HotelController hotelController = new HotelController(hotelModel,hotelView);
        hotelModel.setName("Sun Hotel");
        hotelModel.setPrice(100);
        hotelModel.setCountry("Greece");
        hotelModel.setCity("Thessaloniki");
        hotelModel.setStreetAddress("Konstantinoupolews");
        hotelModel.setStreetAddressNumber("58");
        hotelModel.setSingleBed("1");
        hotelModel.setDoubleBed("2");
        hotelModel.setBalconies("2");
        hotelModel.setRoomView("Sea");
        hotelModel.setBathrooms("2");
        hotelModel.setWifi("Yes");
        hotelModel.setM2("23");
        hotelModel.setDinner("Breakfast");
        hotelModel.setPool("No");
        hotelModel.setRoomService("Yes");
        hotelModel.setParking("Yes");
        hotelModel.setRoofGarden("Yes");
        return hotelController;
    }
    public HotelController updateHotelController2(){
        HotelModel hotelModel = new HotelModel();
        HotelView hotelView = new HotelView();
        HotelController hotelController = new HotelController(hotelModel,hotelView);
        hotelModel.setName("Exodus Hotel");
        hotelModel.setPrice(70);
        hotelModel.setCountry("Greece");
        hotelModel.setCity("Pefkoxwri");
        hotelModel.setStreetAddress("Lampraki");
        hotelModel.setStreetAddressNumber("89");
        hotelModel.setSingleBed("2");
        hotelModel.setDoubleBed("1");
        hotelModel.setBalconies("1");
        hotelModel.setRoomView("No view");
        hotelModel.setBathrooms("1");
        hotelModel.setWifi("Yes");
        hotelModel.setM2("60");
        hotelModel.setDinner("Breakfast");
        hotelModel.setPool("No");
        hotelModel.setRoomService("No");
        hotelModel.setParking("Yes");
        hotelModel.setRoofGarden("No");
        return hotelController;
    }
    public HotelController updateHotelController3(){
        HotelModel hotelModel = new HotelModel();
        HotelView hotelView = new HotelView();
        HotelController hotelController = new HotelController(hotelModel,hotelView);
        hotelModel.setName("Paralia Beach Hotel");
        hotelModel.setPrice(250);
        hotelModel.setCountry("Greece");
        hotelModel.setCity("Kalithea");
        hotelModel.setStreetAddress("Agiou Nikolaou");
        hotelModel.setStreetAddressNumber("11");
        hotelModel.setSingleBed("2");
        hotelModel.setDoubleBed("1");
        hotelModel.setBalconies("1");
        hotelModel.setRoomView("Sea");
        hotelModel.setBathrooms("2");
        hotelModel.setWifi("Yes");
        hotelModel.setM2("110");
        hotelModel.setDinner("Breakfast");
        hotelModel.setPool("Yes");
        hotelModel.setRoomService("Yes");
        hotelModel.setParking("Yes");
        hotelModel.setRoofGarden("Yes");
        return hotelController;
    }
    public HouseController updateHouseController1(){
        HouseModel houseModel = new HouseModel();
        HouseView houseView = new HouseView();
        HouseController houseController = new HouseController(houseModel,houseView);
        houseModel.setName("Nikos Apartments");
        houseModel.setPrice(50);
        houseModel.setCountry("Greece");
        houseModel.setCity("Athina");
        houseModel.setStreetAddress("Ermou");
        houseModel.setStreetAddressNumber("11");
        houseModel.setSingleBed("3");
        houseModel.setDoubleBed("1");
        houseModel.setBalconies("2");
        houseModel.setRoomView("No View");
        houseModel.setBathrooms("1");
        houseModel.setWifi("Yes");
        houseModel.setM2("90");
        houseModel.setYard("Yes");
        houseModel.setPlayRoom("No");
        houseModel.setLoft("No");
        return  houseController;


    }
    public HouseController updateHouseController2(){
        HouseModel houseModel = new HouseModel();
        HouseView houseView = new HouseView();
        HouseController houseController = new HouseController(houseModel,houseView);
        houseModel.setName("GreatPlace Apartments");
        houseModel.setPrice(70);
        houseModel.setCountry("Greece");
        houseModel.setCity("Thessaloniki");
        houseModel.setStreetAddress("Papafi");
        houseModel.setStreetAddressNumber("115");
        houseModel.setSingleBed("2");
        houseModel.setDoubleBed("1");
        houseModel.setBalconies("2");
        houseModel.setRoomView("No View");
        houseModel.setBathrooms("1");
        houseModel.setWifi("Yes");
        houseModel.setM2("120");
        houseModel.setYard("No");
        houseModel.setPlayRoom("No");
        houseModel.setLoft("Yes");
        return  houseController;
    }
    public HouseController updateHouseController3() {
        HouseModel houseModel = new HouseModel();
        HouseView houseView = new HouseView();
        HouseController houseController = new HouseController(houseModel, houseView);
        houseModel.setName("Nice View Apartments");
        houseModel.setPrice(40);
        houseModel.setCountry("Greece");
        houseModel.setCity("Kavala");
        houseModel.setStreetAddress("Riga Ferraiou");
        houseModel.setStreetAddressNumber("28");
        houseModel.setSingleBed("2");
        houseModel.setDoubleBed("1");
        houseModel.setBalconies("2");
        houseModel.setRoomView("Sea");
        houseModel.setBathrooms("1");
        houseModel.setWifi("Yes");
        houseModel.setM2("60");
        houseModel.setYard("Yes");
        houseModel.setPlayRoom("Yes");
        houseModel.setLoft("No");
        return houseController;
    }

    public ArrayList<RoomsController> createRooms(){
        rooms.add(updateHotelController1());
        rooms.add(updateHotelController2());
        rooms.add(updateHotelController3());
        rooms.add(updateHouseController1());
        rooms.add(updateHouseController2());
        rooms.add(updateHouseController3());
        return rooms;
    }
    public void addRoom(RoomsController room){
        rooms.add(room);
    }
    public ArrayList<RoomsController> getRooms(){
        return rooms;
    }
}
