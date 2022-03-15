package Controller.Communication;
import Controller.Parser;
import Model.Communication.ProviderModel;
import View.Communication.ProviderView;

public class ProviderController extends CommunicationController{
    private ProviderModel model;
    private ProviderView view;
    private Parser parser = new Parser();

    /**
     * Here is a constructor for this class that inherits information from other classes
     *
     * @param model
     * @param view
     */
    public ProviderController(ProviderModel model, ProviderView view) {
        super(model,view);
        this.model = model;
        this.view = view;
    }
    public ProviderController createProvider(){
        ProviderModel model = new ProviderModel();
        ProviderView view = new ProviderView();
        ProviderController controller = new ProviderController(model,view);
        super.createCommunication();
        return controller;

    }
    public String getUser(){
        return model.getUser();
    }

    @Override
    public void updateView() {
        view.printProviderDetails(model.getUser(), model.getFirstName(), model.getLastName(),model.getMobile(),
                model.getBirthDay(),model.getBirthMonth(),model.getBirthYear(),model.getCountry(),model.getCity(),
                model.getStreetAddress(),model.getStreetAddressNumber(),model.getPostCode(),model.getEmail());
    }
}
