package Hotel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(4, "Luxe", 1);
        Room room2 = new Room(2, "Business", 2);
        Room room3 = new Room(6, "Budget", 3);

        ArrayList<Room> roomList = new ArrayList<Room>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

//        System.out.println(roomList.get(1).toString());
        System.out.println(roomList.get(1).getRoomType());

//        for(Room d:roomList) {
//            System.out.println(roomList.get[d]);
//        }


//        for (int i = 0; i < roomList.size(); i++) {
//            System.out.println(roomList[i]);
//        }


//        room1.setRoomID(1);
//        Guest guest1 = new Guest("Richard", "Smith", "Springlaan", "8765AM",
//                "Amsterdam", "Nederland","0624242526", "blabla@hotmail.com");
//        System.out.println(room1.getRoomID());
//        System.out.println(room1.getRoomType());
//        room1.setRoomID(2);
//        System.out.println(room1.getRoomID());
//        System.out.println(guest1.getAllGuestDetails());
//        Booking booking1 = new Booking(1,123,1,"01-05-2018", "10-05-2018",false);
//        System.out.println(booking1.isGuestPaid());

    }
}
