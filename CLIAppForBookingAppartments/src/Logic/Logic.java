package Logic;
import Controller.Communication.ClientController;
import Controller.Communication.CommunicationController;
import Controller.Communication.ProviderController;
import Model.Communication.ClientModel;
import Model.Communication.ProviderModel;
import Model.RoomData;
import Controller.Parser;
import Model.UserData;
import View.Communication.ClientView;
import View.Communication.ProviderView;

import java.util.Locale;

public class Logic {
    private RoomData data = new RoomData();
    private UserData users = new UserData();
    private Parser parser = new Parser();
    private Prints prints = new Prints();
    private ClientView clientView = new ClientView();
    private ClientModel clientModel = new ClientModel();
    private ClientController clientController = new ClientController(clientModel,clientView);
    private ProviderView providerView = new ProviderView();
    private ProviderModel providerModel = new ProviderModel();
    private ProviderController providerController = new ProviderController(providerModel,providerView);
    private int exit=0;
    int choose;
    public void welcome() {
        System.out.println("Welcome to the booking application");
        data.createRooms();
        while(exit==0){
            prints.menu();
            choose = parser.intParser();
            switch (choose){
                case 1:
                    boolean flag1 = true;
                    while(flag1){
                        prints.printRooms(data.getRooms());
                        int x = parser.intParser();
                        if(x!=0) {
                            prints.printRoom(data.getRooms(), x);
                        }else{
                            flag1=false;
                        }
                        System.out.println("Press 1 to see again the apartments or press 0 to go to the main menu");
                        int y = parser.intParser();
                        if(y==0){
                            break;
                        }
                    }
                    break;
                case 0:
                    exit = 1;
                    break;
                case 2:
                    users.createUsers();
                    boolean flag2 = true;
                    while(flag2){
                        System.out.println("Enter your password: ");
                        String password = parser.stringParser();
                        System.out.println("Enter your email: ");
                        String email = parser.stringParser();
                        for(CommunicationController controller: users.getUsers()){
                            if(controller.getPassword().equals(password) && controller.getEmail().equals(email)){
                                System.out.println("Successful Login!");
                                flag2=false;
                            }
                        }
                        if(flag2) {
                            System.out.println("Wrong password or email!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Choose if your making an account as a client or as provider");
                    System.out.println("Write client or provider");
                    String typeOfUser = parser.stringParser();
                    while(!typeOfUser.equalsIgnoreCase("client") && !typeOfUser.equalsIgnoreCase("provider")){
                        System.out.println("Choose right between client or provider");
                        typeOfUser = parser.stringParser();
                    }
                    if(typeOfUser.equalsIgnoreCase("client")){
                        ClientController example = clientController.createClient();
                        users.addUser(example);
                    }else if(typeOfUser.equalsIgnoreCase("provider")){
                        ProviderController example = providerController.createProvider();
                        users.addUser(example);
                    }


            }
        }
    }
}
