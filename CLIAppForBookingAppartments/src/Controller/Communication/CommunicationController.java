package Controller.Communication;
import Controller.Parser;
import Model.Communication.CommunicationModel;
import View.Communication.CommunicationView;

/** CommunicationController is a class that asks for
 * information and answers */

public class CommunicationController {
    private CommunicationModel model;
    private CommunicationView view;
    private Parser parser = new Parser();

    /**Here is a constructor for this class that inherits information from other classes*/
    public CommunicationController(CommunicationModel model, CommunicationView view){
        this.view = view;
        this.model = model;
    }
    /**Setters print ask for each information
     * and the scan for an answer */
    public void setFirstName() {
        System.out.println("Enter your first name: ");
        model.setFirstName(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setFirstName();
        }
    }
    public void setLastName() {
        System.out.println("Enter your last name: ");
        model.setLastName(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setLastName();
        }
    }
    public void setMobile() {
        System.out.println("Enter your mobile: ");
        model.setMobile(parser.stringParser());
        while (!parser.checkString(model.getMobile())){
            setMobile();
        }
    }

    public void setPassword() {
        System.out.println("Enter your password: ");
        model.setPassword(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setPassword();
        }
    }
    public void setPasswordValidation() {
        System.out.println("Validate your password: ");
        model.setPasswordValidation(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setPasswordValidation();
        }
        while (!model.getPassword().equals(model.getPasswordValidation())){
            System.out.println("Validation error");
            setPassword();
            setPasswordValidation();
        }
    }
    public void setBirthDay() {
        System.out.println("Enter the day of your birth : ");
        model.setBirthDay(parser.stringParser());
        while (!parser.checkString(model.getBirthDay())){
            setBirthDay();
        }
    }
    public void setBirthMonth() {
        System.out.println("Enter the month of your birth : ");
        model.setBirthMonth(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setBirthMonth();
        }
    }
    public void setBirthYear() {
        System.out.println("Enter the year of your birth : ");
        model.setBirthYear(parser.stringParser());
        while (!parser.checkString(model.getBirthYear())){
            setBirthYear();
        }
    }
    public void setCountry() {
        System.out.println("Enter your country: ");
        model.setCountry(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setCountry();
        }
    }
    public void setCity() {
        System.out.println("Enter your city: ");
        model.setCity(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setCity();
        }
    }
    public void setStreetAddress() {
        System.out.println("Enter your street address: ");
        model.setStreetAddress(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setStreetAddress();
        }
    }
    public void setStreetAddressNumber() {
        System.out.println("Enter the number of the street: ");
        model.setStreetAddressNumber(parser.stringParser());
        while (!parser.checkString(model.getStreetAddressNumber())){
            setStreetAddressNumber();
        }
    }
    public void setPostCode() {
        System.out.println("Enter your PostCode: ");
        model.setPostCode(parser.stringParser());
        while (!parser.checkString(model.getPostCode())){
            setPostCode();
        }
    }
    public void setEmail() {
        System.out.println("Enter your email: ");
        model.setEmail(parser.stringParser());
        while (!parser.checkString(model.getFirstName())){
            setEmail();
        }
    }
    public String getPassword(){
        return model.getPassword();
    }
    public String getEmail(){
        return model.getEmail();
    }
    public void createCommunication(){
        setFirstName();
        setLastName();
        setMobile();
        setEmail();
        setPassword();
        setPasswordValidation();
        setCountry();
        setCity();
        setStreetAddress();
        setStreetAddressNumber();
        setBirthDay();
        setBirthMonth();
        setBirthYear();
        setPostCode();
    }

    public void updateView(){
        view.printUsersDetails(model.getFirstName(),model.getLastName(), model.getMobile(), model.getBirthDay(),
                model.getBirthMonth(),model.getBirthYear(),model.getCountry(),model.getCity(),
                model.getStreetAddress(), model.getStreetAddressNumber(),model.getPostCode(),model.getEmail());
    }
}
