package View.Rooms;

public class HouseView extends RoomsView{
    public void printHouseDetails(String name,String house,int price,String country, String city, String streetAddress, String streetAddressNumber, String singleBed, String doubleBed, String balconies, String roomView,
                                  String bathrooms, String wifi, String m2, String yard, String playroom, String loft){
        System.out.println(house);
        super.printRoomsDetails(name,price,country,city,streetAddress,streetAddressNumber,singleBed, doubleBed, balconies, roomView, bathrooms, wifi, m2);
        System.out.println("Yard: "+yard);
        System.out.println("Playroom: "+playroom);
        System.out.println("Loft: "+loft);
    }
}
