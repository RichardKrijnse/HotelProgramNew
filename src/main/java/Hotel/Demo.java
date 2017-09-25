package Hotel;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(1, "luxe", 1);

        room1.setRoomID(1);
        Guest guest1 = new Guest("Richard", "Smith", "Springlaan", "8765AM",
                "Amsterdam", "Nederland","0624242526", "blabla@hotmail.com");
        System.out.println(room1.getRoomID());
        System.out.println(room1.getRoomType());
        room1.setRoomID(2);
        System.out.println(room1.getRoomID());
        System.out.println(guest1.getAllGuestDetails());
        Booking booking1 = new Booking(1,123,1,"01-05-2018", "10-05-2018",false);
        System.out.println(booking1.isGuestPaid());

    }
}
