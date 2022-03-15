package View.Rooms;

public class RoomsView {
    public void printRoomsDetails(String name,int price,String country,String city, String streetAddress,
                                  String streetAddressNumber,String singleBed,String doubleBed,String balconies,
                                  String roomView, String bathrooms, String wifi, String m2){
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Single beds: "+singleBed);
        System.out.println("Double beds: "+doubleBed);
        System.out.println("Balconies: "+balconies);
        System.out.println("View: "+roomView);
        System.out.println("Bathrooms: "+bathrooms);
        System.out.println("Wifi: "+wifi);
        System.out.println("M2: "+m2);
    }
}
