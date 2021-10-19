package B1;

public abstract class Animal {
String name;
int old;
String description;
public Animal(String name, int old, String description) {
	super();
	this.name = name;
	this.old = old;
	this.description = description;
}
public void Animal() {
	
}

public Animal(String name) {
	this.name = name;
}

public Animal(String name, int old) {
	this.name = name;
	this.old = old;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getOld() {
	return old;
}
public void setOld(int old) {
	this.old = old;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public void display() {
	System.out.println(toString());
}
@Override
public String toString() {
	return "Animal [name=" + name + ", old=" + old + ", description=" + description + "]";
}
public abstract void sound();
	
}

