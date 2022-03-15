package Logic;

import Controller.Communication.CommunicationController;
import Controller.Parser;
import Controller.Rooms.RoomsController;

import java.util.ArrayList;

public class Prints {
    private Parser parser = new Parser();
    public void printRooms(ArrayList<RoomsController> rooms){
        int i=1;
        for(RoomsController controller : rooms){
            System.out.println(i+". "+controller.getName()+" costs "+controller.getPrice()+" Euros");
            i++;
        }
        System.out.println("Press the number of the apartment that you want to see more details");
        System.out.println("or press 0 to return to main menu");
    }
    public void printRoom(ArrayList<RoomsController> rooms, int x){
        rooms.get(x-1).updateView();
    }
    public void menu(){
        System.out.println("Tell us what you want to do by typing the number:");
        System.out.println("1 --> See available rooms");
        System.out.println("2 --> Login to your account");
        System.out.println("3 --> Register");
        System.out.println("0 --> Exit");
    }
    /*public void login(ArrayList<CommunicationController> users){
        System.out.println("Enter your password: ");
        String password = parser.stringParser();
        System.out.println("Enter your email: ");
        String email = parser.stringParser();
        for(CommunicationController controller: users){
            System.out.println(controller.getPassword());
            if(controller.getPassword().equals(password) && controller.getEmail().equals(email)){

                System.out.println("Successful Login!");
                flag2=false;
            }else{
                System.out.println("Wrong password or email!");
            }
        }
    }*/
}
