package View.Communication;

public class ClientView extends CommunicationView{

    public void printClientDetails(String user,String firstName,String lastName, String mobile, String birthDay, String birthMonth,
                                  String birthYear,String country, String city, String streetAddress, String streetAddressNumber,
                                  String postcode,String email){
        System.out.println("Kind of user: "+user);
        super.printUsersDetails(firstName,lastName,mobile,birthDay,birthMonth,birthYear,country,city,streetAddress,streetAddressNumber,
                postcode,email);
    }
}
