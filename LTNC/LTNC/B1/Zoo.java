package B1;

import java.util.ArrayList;

public class Zoo {
ArrayList<Room> roomList = new ArrayList<>();
public void addRoom(Room room) {
	roomList.add(room);
	
}
public void deleteRoom(int roomNo) {
	for (int i = 0; i < roomList.size(); i++) {
		if (roomList.get(i).getRoomNo() == roomNo) {
			roomList.remove(i);
		}
	}
	
}
}
