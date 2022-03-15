package Model.Communication;

/**CommunicationModel is a class that includes all the details
 * that is needed to make a register */
public class CommunicationModel {
    private String firstName;
    private String lastName;
    private String mobile;
    private String streetAddress;
    private String streetAddressNumber;
    private String email;
    private String password;
    private String passwordValidation;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String country;
    private String city;
    private String postCode;

    /**Setters to save the new value */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public void setStreetAddressNumber(String streetAddressNumber) {
        this.streetAddressNumber = streetAddressNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPasswordValidation(String passwordValidation) {
        this.passwordValidation = passwordValidation;
    }
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }
    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
/**Getter to call them if we want to get the new value */
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMobile() {
        return mobile;
    }
    public String getStreetAddress() {
        return streetAddress;
    }
    public String getStreetAddressNumber() {
        return streetAddressNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getPasswordValidation() {
        return passwordValidation;
    }
    public String getBirthDay() {
        return birthDay;
    }
    public String getBirthMonth() {
        return birthMonth;
    }
    public String getBirthYear() {
        return birthYear;
    }
    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }
    public String getPostCode() {
        return postCode;
    }
}
