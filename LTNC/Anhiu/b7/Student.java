package b7;

import java.io.Serializable;

public class Student implements Serializable {
private int id;
private String name;
private String address;
private byte age;
private float gpa;
public Student() {
	
}
public Student(int id, String name, String address, byte age, float gpa) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.age = age;
	this.gpa = gpa;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public byte getAge() {
	return age;
}
public void setAge(byte age) {
	this.age = age;
}
public float getGpa() {
	return gpa;
}
public void setGpa(float gpa) {
	this.gpa = gpa;
}

}
