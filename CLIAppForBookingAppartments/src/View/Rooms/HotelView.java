package View.Rooms;

public class HotelView extends RoomsView{
    public void printHotelDetails(String name,String hotel,int price,String country, String city, String streetAddress,
                                  String streetAddressNumber,String singleBed, String doubleBed, String balconies,
                                  String roomView, String bathrooms, String wifi, String m2, String dinner,String pool,
                                  String roomService, String parking, String roofGarden) {
        System.out.println("These are your room details: ");
        System.out.println(hotel);
        super.printRoomsDetails(name,price,country,city,streetAddress,streetAddressNumber,singleBed, doubleBed,
                balconies, roomView, bathrooms, wifi, m2);
        System.out.println("Dinner: "+dinner);
        System.out.println("Pool: "+pool);
        System.out.println("Room service: "+roomService);
        System.out.println("Parking: "+parking);
        System.out.println("Roofgarden: "+roofGarden);
    }
}
