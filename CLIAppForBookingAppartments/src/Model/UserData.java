package Model;
import Controller.Communication.CommunicationController;
import Controller.Communication.ClientController;
import Controller.Communication.ProviderController;
import Controller.Rooms.RoomsController;
import Model.Communication.ClientModel;
import Model.Communication.CommunicationModel;
import Model.Communication.ProviderModel;
import View.Communication.ClientView;
import View.Communication.ProviderView;

import java.util.ArrayList;
import java.util.HashMap;

public class UserData {
    private static ArrayList<CommunicationController> users = new ArrayList<>();
    private static HashMap<String,CommunicationController> userEmails = new HashMap<>();

    public ClientController updateClientController1(){
        ClientModel model = new ClientModel();
        ClientView view = new ClientView();
        ClientController controller = new ClientController(model,view);
        model.setFirstName("Thanasis");
        model.setLastName("Konstantinidis");
        model.setMobile("697850110");
        model.setPassword("1234");
        model.setBirthYear("1995");
        model.setBirthMonth("August");
        model.setBirthDay("20");
        model.setCountry("Greece");
        model.setCity("Volos");
        model.setStreetAddress("Metamorfwsi");
        model.setStreetAddressNumber("61");
        model.setPostCode("35580");
        model.setEmail("Thanasiskon@hotmail.com");
        return controller;
    }
    public ProviderController updateProviderController1(){
        ProviderModel model = new ProviderModel();
        ProviderView view = new ProviderView();
        ProviderController controller = new ProviderController(model,view);
        model.setFirstName("Ilias");
        model.setLastName("Nikolaidis");
        model.setMobile("6934511990");
        model.setPassword("123456");
        model.setBirthYear("1999");
        model.setBirthMonth("March");
        model.setBirthDay("19");
        model.setCountry("Greece");
        model.setCity("Kozani");
        model.setStreetAddress("Papanikolaou");
        model.setStreetAddressNumber("24");
        model.setPostCode("46660");
        model.setEmail("IliasNik@gmail.com");
        return controller;
    }
    public CommunicationModel updateCommunicationModel3(){
        CommunicationModel example = new CommunicationModel();
        example.setFirstName("Thomas");
        example.setLastName("Papapetrou");
        example.setMobile("6986619333");
        example.setBirthYear("1992");
        example.setBirthMonth("January");
        example.setBirthDay("5");
        example.setCountry("Greece");
        example.setCity("Thessaloniki");
        example.setStreetAddress("Lagkada");
        example.setStreetAddressNumber("10");
        example.setPostCode("55131");
        example.setEmail("ThomasPap@hotmail.com");
        return example;
    }
    public ArrayList<CommunicationController> createUsers(){
        users.add(updateClientController1());
        users.add(updateProviderController1());
        return users;
    }
    public void addUser(CommunicationController user){
        users.add(user);
    }
    public ArrayList<CommunicationController> getUsers(){
        return users;
    }
    public void addHashMap(CommunicationController controller){
        userEmails.put(controller.getEmail(),controller);
    }
    public HashMap<String, CommunicationController> createUserEmails(){
        userEmails.put(updateClientController1().getEmail(),updateClientController1());
        userEmails.put(updateProviderController1().getEmail(),updateProviderController1());
        return userEmails;
    }
}
