package View.Communication;

/**Communication view is a class that is going to help us print all the details about a user is given*/
public class CommunicationView {
/**Here is a constructor with all those details*/
    public void printUsersDetails(String firstName,String lastName, String mobile, String birthDay, String birthMonth,
                                  String birthYear,String country, String city, String streetAddress, String streetAddressNumber,
                                  String postcode,String email){
        System.out.println("Your Communication Details are:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Mobile Number: "+mobile);
        System.out.println("Birth: "+birthDay+" "+birthMonth+" "+birthYear);
        System.out.println("Country: "+country);
        System.out.println("City: "+ city);
        System.out.println("Street address and number: "+streetAddress+" "+streetAddressNumber);
        System.out.println("PostCode: "+postcode);
        System.out.println("Email: "+email);
    }
}
