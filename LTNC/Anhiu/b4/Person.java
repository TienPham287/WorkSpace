package b4;

import java.util.Scanner;

public class Person {
String name ;
String gender;
String birthday;
String address;
public Person() {
	super();
}
public Person(String name, String gender, String birthday, String address) {
	super();
	this.name = name;
	this.gender = gender;
	this.birthday = birthday;
	this.address = address;
}
public void inputInfor() {
	Scanner input = new Scanner(System.in);
	System.out.println("Nhap ten: ");
	name = input.nextLine();
	System.out.println("Nhap gioi tinh :");
	gender = input.nextLine();
	System.out.println("Nhap dia chi :");
	address = input.nextLine();
	
}
public void showInfor() {
	System.out.println("Ten :" + name+ "Gioi tinh :" +gender+"ngay sinh:" + birthday+"dia chi :" + address);
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
