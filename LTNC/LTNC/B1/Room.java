package B1;

import java.util.ArrayList;

public class Room {
int roomNo;
ArrayList<Animal> animalList = new ArrayList<>();

public void addAnimal(Animal animal) {
	animalList.add(animal);
	
}
 public void deleteAnimal(String name) {
	 for (int i = 0; i < animalList.size(); i++) {
		if (animalList.get(i).getName().equalsIgnoreCase(name)) {
			animalList.remove(i);
			break;
		}
	}
 }
public int getRoomNo() {
	return roomNo;
}
public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}

 
}
