package Controller.Communication;

import Controller.Parser;
import Model.Communication.ClientModel;
import Model.Communication.CommunicationModel;
import View.Communication.ClientView;
import View.Communication.CommunicationView;

public class ClientController extends CommunicationController {
    private ClientModel model;
    private Parser parser = new Parser();
    private ClientView view;

    /**
     * Here is a constructor for this class that inherits information from other classes
     *
     * @param model
     * @param view
     */
    public ClientController(ClientModel model, ClientView view) {
        super(model, view);
        this.model = model;
        this.view = view;
    }
    public ClientController createClient(){
        ClientModel model = new ClientModel();
        ClientView view = new ClientView();
        ClientController controller = new ClientController(model,view);
        System.out.println("Add your personal details");
        super.createCommunication();
        return controller;

    }
    public String getUser(){
        return model.getUser();
    }

    @Override
    public void updateView() {
        view.printClientDetails(model.getUser(), model.getFirstName(), model.getLastName(),model.getMobile(),
                model.getBirthDay(),model.getBirthMonth(),model.getBirthYear(),model.getCountry(),model.getCity(),
                model.getStreetAddress(),model.getStreetAddressNumber(),model.getPostCode(),model.getEmail());
    }
}
