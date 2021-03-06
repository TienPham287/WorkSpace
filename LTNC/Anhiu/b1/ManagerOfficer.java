package b1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {
private List<Officer> officers;

public ManagerOfficer() {
	this.officers = new ArrayList<>();

}
public void AddOfficer(Officer oficer) {
	officers.add(oficer);
}
public List<Officer> searchOfficerByName(String name){
	return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
}
public void showListInforrOfficer() {
	this.officers.forEach(o -> System.out.println(o.toString()));
	
	
}
public void showListInforOfficer() {
	this.officers.forEach(o -> System.out.println(o.toString()));
	
}
}
